import com.betteryanwo.dao.CartInfoDao;
import com.betteryanwo.entity.CartInfo;
import com.betteryanwo.entity.Goods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-6-8
 */
public class CartInfoTest extends BaseTest{
    @Autowired
    CartInfoDao cartInfoDao;
    @Test
    public void test() {
        cartInfoDao.getById(15l,3l);
    }
    @Test
    public void test1(){
        cartInfoDao.getAll();
    }
    @Test
    public void test2(){
        CartInfo cartInfo = new CartInfo();
        cartInfo.setId(11l);
        CartInfo cartInfo1 = cartInfoDao.getByCartItem(cartInfo);
        System.out.println("abcde:"+cartInfo1);
    }
    @Test
    public void test3(){
        cartInfoDao.getAllByCartId(1l);
    }
    @Test
    public void test4(){
        Goods goods = new Goods();
        goods.setGoodsId(11l);
        CartInfo cartInfo = new CartInfo(null, 3, 1l, goods,new BigDecimal(45000));
        cartInfoDao.insert(cartInfo);
    }
    @Test
    public void test5(){
        cartInfoDao.delete(26l);
    }
    @Test
    public void test6(){
        cartInfoDao.deleteByCartId(1l);
    }
    @Test
    public void test7(){
        CartInfo cartInfo = new CartInfo();
        cartInfo.setId(11l);
        cartInfo.setCartId(1l);
        Goods goods = new Goods();
        goods.setGoodsId(11l);
        cartInfo.setGoods(goods);
        cartInfoDao.update(cartInfo);
    }
    @Test
    public void test8(){
        cartInfoDao.selectCartInfoByGoodsIdAndCartId(3l,3l);
    }
}

