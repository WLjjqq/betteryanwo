import com.betteryanwo.dao.CartItemDao;
import com.betteryanwo.dto.CartItemDto;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.service.CartItemService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Create by 六
 * Date:18-6-1
 */
public class CartServcieTest extends BaseTest {
    @Autowired
    CartItemDao cartItemDao;

    @Autowired
    CartItemService cartItemService;
    @Test
    public void test(){
        List<Map<String, Object>> maps = cartItemService.getNumAndPrice(3l, 3l);
        Object num=null;
        Object itemNum=null;
        Object id=null;
        for(Map map:maps){
             num= map.get("num");
             itemNum = map.get("itemNum");
             id = map.get("id");
        }
        System.out.println(num+" "+ itemNum+" "+id);
    }

    @Test
    public void test1(){
        CartItem cartItem = new CartItem();
        cartItem.setCartId(1l);
        Goods goods = new Goods();
        goods.setGoodsId(8l);
        cartItem.setGoods(goods);
        cartItemService.getByCartItem(cartItem);
    }

    @Test
    public void test2(){
        /*List<CartItemDto> cartItems = cartItemService.getAllByCartIdDto(3l);
        for(CartItemDto cartItem:cartItems){
            System.out.println(cartItem);
        }*/
        List<CartItem> cartItems = cartItemService.getAllByCartId(3l);
        for(CartItem cartItem:cartItems){
            System.out.println(cartItem);
        }
        /*List<CartItem> cartItems1 = cartItemDao.getAllByCartId(3l);
        for(CartItem cartItem:cartItems1){
            System.out.println(cartItem);
        }*/
    }
    @Test
    public void test3(){
        List<CartItemDto> allByCartId2 = cartItemService.getAllByCartId2(3l);
        for(CartItemDto cartItem:allByCartId2){
            System.out.println(cartItem);
        }
    }

    @Test
    public void test4(){
        List<Long> ids = new ArrayList<>();
        ids.add(5l);
        ids.add(4l);
        cartItemService.deleteBatch(ids);
    }
}
