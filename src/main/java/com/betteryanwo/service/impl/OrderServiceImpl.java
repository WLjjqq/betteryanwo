package com.betteryanwo.service.impl;

import com.betteryanwo.dao.OrderDao;
import com.betteryanwo.dao.OrderItemDao;
import com.betteryanwo.dto.CartItemDto;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Order;
import com.betteryanwo.entity.OrderItem;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.CartItemService;
import com.betteryanwo.service.OrderItemService;
import com.betteryanwo.service.OrderService;
import com.betteryanwo.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Create by 六
 * Date:18-6-8
 */
@Service
public class OrderServiceImpl implements OrderService {
   @Autowired
    ShopCartService shopCartService;
   @Autowired
    OrderDao orderDao;
   @Autowired
    OrderItemService orderItemService;
    @Autowired
    CartItemService cartItemService;
    @Autowired
    OrderItemDao orderItemDao;
    /**
     * 添加订单
     * @param userId 用户
     * @param orderSerial 订单序列号（可为null）
     * @param isInvoice
     * @return
     */
    @Override
    public Order insert(Long userId, String orderSerial, Integer isInvoice) {
        try {
            //1:查询购物车明细
            Cart cart = shopCartService.getByUserId(userId);
            if(null==cart){
                throw new OrderException("购物车为null");
            }
            //添加订单
            Order order = new Order();
            //新建订单项
            List<OrderItem> orderItemList = new ArrayList<>();
            //初始化订单，在数据库中生成订单
            initOrder(order,orderItemList,cart,userId,orderSerial,isInvoice);
            orderItemService.insertList(orderItemList);
            order.setOrderItems(orderItemList);
            return order;
        }catch (Exception e){
            if (e instanceof OrderException) {
                throw new OrderException(e.getMessage());
            }
            throw new OrderException("添加订单异常");
        }

    }

    /**
     * 初始化订单
     * @param order 订单
     * @param orderItemList  订单项
     * @param cart  购物车
     * @param userId    用户ID
     * @param orderSerial 订单序列号
     * @param isInvoice    是否需要发票
     */
    private void initOrder(Order order, List<OrderItem> orderItemList, Cart cart, Long userId, String orderSerial,
                           Integer isInvoice){
        try{
            //一：添加订单
            //1:判断购物车项是否为空
            List<CartItem> cartItems = cartItemService.getAllByCartId(cart.getId());
            //List<CartInfo> cartItems = cart.getCartItems();
            System.out.println("cartItems的值："+cartItems);
            if(null==cartItems || cartItems.size()==0){
                throw new OrderException("购物车为空");
            }
            //2:要不要发票
            if(1==isInvoice){
                order.setIsInvoice(isInvoice);
            }else{
                order.setIsInvoice(0);
            }
            //3:发票信息
            order.setOrderSerial(orderSerial);
            //4:设置时间,状态，价格
            order.setDateCreated(new Date());
            order.setDateUpdated(new Date());
            order.setStatus(1);
            order.setUserId(userId);
            order.setPrice(cart.getPrice());
            order.setShoppingStatus(0);
            order.setPaymentMethod(0);
            //5:添加订单到数据库
            orderDao.insert(order);
            //二：添加订单项
            for(CartItem cartItem:cartItems){
                OrderItem oim = new OrderItem();// 新建一个订单项
                oim.setOrderId(order.getId());
                oim.setItemNum(cartItem.getItemNum());
                oim.setPrice(cartItem.getPrice());
                oim.setGoods(cartItem.getGoods());
                addOrderItemToList(userId, orderItemList, oim);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new OrderException("初始化订单出错",e);
        }
    }


    /**
     * 把订单项添加到订单列表中
     * @param userId
     * @param orderItemList
     * @param orderItem
     */
    private void addOrderItemToList(Long userId,List<OrderItem> orderItemList,OrderItem orderItem){
        try {
            orderItemList.add(orderItem);
        }catch (Exception e){
            throw new OrderException("添加订单项到订单列表出错。");
        }
    }

    /**
     * 修改订单状态
     * @param order
     * @return
     */
    @Override
    public int updateOrder(Order order) {
        return orderDao.update(order);
    }

    /**
     * 根据订单号删除订单,包含订单项
     * @param orderSerial
     * @return
     */
    @Override
    public int deleteOrder(Long orderId,String orderSerial) {
        orderItemDao.deleteOrderItem(orderId);
        return orderDao.delete(orderSerial);
    }

    /**
     * 根据订单号查询订单
     * @param orderSerial
     * @return
     */
    @Override
    public Order getOrderByOrderSerial(String orderSerial) {
        return orderDao.getOrderByOrderSerial(orderSerial);
    }

    @Override
    public Order getByUserIdAndOrderSerial(Long userId, String orderSerial) {
        return null;
    }


}
