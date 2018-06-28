import com.betteryanwo.dao.CartItemDao;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Goods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by 六
 * Date:18-6-8
 */
public class CartItemTest extends BaseTest{
    @Autowired
    CartItemDao cartItemDao;
    @Test
    public void test() {
        cartItemDao.getById(15l,3l);
    }
    @Test
    public void test1(){
        cartItemDao.getAll();
    }
    @Test
    public void test2(){
        CartItem cartItem = new CartItem();
        cartItem.setId(11l);
        CartItem cartInfo1 = cartItemDao.getByCartItem(cartItem);
        System.out.println("abcde:"+cartInfo1);
    }
    @Test
    public void test3(){
        cartItemDao.getAllByCartId(1l);
    }
    @Test
    public void test4(){
        Goods goods = new Goods();
        goods.setGoodsId(11l);
        CartItem cartItem = new CartItem(null, 3, 1l, goods,new BigDecimal(45000));
        cartItemDao.insert(cartItem);
    }
    @Test
    public void test5(){
        cartItemDao.delete(26l);
    }
    @Test
    public void test6(){
        cartItemDao.deleteByCartId(1l);
    }
    @Test
    public void test7(){
        CartItem cartItem = new CartItem();
        cartItem.setId(11l);
        cartItem.setCartId(1l);
        Goods goods = new Goods();
        goods.setGoodsId(11l);
        cartItem.setGoods(goods);
        cartItemDao.update(cartItem);
    }
    @Test
    public void test8(){
        cartItemDao.selectCartInfoByGoodsIdAndCartId(3l,3l);
    }

    @Test
    public void test9(){
        List<Long> ids = new ArrayList<>();
        ids.add(6l);
        ids.add(7l);
        ids.add(8l);
        cartItemDao.deleteBatch(ids);
    }
}

