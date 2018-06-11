import com.betteryanwo.dao.OrderItemDao;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.entity.OrderItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Create by 六
 * Date:18-6-9
 */
public class OrderItemDaoTest extends BaseTest {
    @Autowired
    OrderItemDao orderItemDao;
    @Test
    public void test(){
        Goods goods = new Goods();
        goods.setGoodsId(1l);
        OrderItem orderItem1 = new OrderItem(null, 4, 3l, new BigDecimal(4000), goods);
        OrderItem orderItem2= new OrderItem(null, 5, 3l, new BigDecimal(5000), goods);
        OrderItem orderItem3 = new OrderItem(null, 6, 3l, new BigDecimal(6000), goods);
        OrderItem orderItem4 = new OrderItem(null, 7, 3l, new BigDecimal(7000), goods);
        ArrayList<OrderItem> orderItems  = new ArrayList<>();
        orderItems.add(orderItem1);
        orderItems.add(orderItem2);
        orderItems.add(orderItem3);
        orderItems.add(orderItem4);
        orderItemDao.insertList(orderItems);
    }
    @Test
    public void test1(){
        OrderItem orderItem = new OrderItem();
        orderItem.setId(1l);
        orderItem.setItemNum(3);
        orderItem.setPrice(new BigDecimal(9000000));
        orderItemDao.update(orderItem);
    }
    @Test
    public void test2(){
        orderItemDao.delete(1l);
    }

    @Test
    public void test3(){
        orderItemDao.deleteByOrderId(3l);
    }
}
