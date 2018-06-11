import com.betteryanwo.dao.ShopCartDao;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Create by 六
 * Date:18-5-29
 */
public class CartTest extends BaseTest {
    @Autowired
    ShopCartDao shopCartDao;
    @Test
    public void test(){
       shopCartDao.getById(1l);
    }
    @Test
    public void test1(){
        Cart countByUserId = shopCartDao.getCountByUserId(1l);
        System.out.println(countByUserId);
    }
    @Test
    public void test2(){
        Cart allByUserId = shopCartDao.getAllByUserId(1l);
    }

    @Test
    public void test3(){
        List<Cart> all = shopCartDao.getAll();
    }
    @Test
    public void test4(){
        Cart cart = new Cart();
        cart.setUserId(1l);
        shopCartDao.getAllByCart(cart);
    }
    @Test
    public void test5(){
        Cart cart = new Cart();
        cart.setId(3l);
        cart.setPrice(new BigDecimal(13000));
        cart.setUserId(1L);
        cart.setStatus(0);
        shopCartDao.insert(cart);
    }
    @Test
    public void test6(){
        Cart cart = new Cart();
        cart.setId(1l);
        cart.setPrice(new BigDecimal(49000));
        shopCartDao.update(cart);
    }
}
