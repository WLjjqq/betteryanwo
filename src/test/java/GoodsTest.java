import com.betteryanwo.dao.GoodsDao;
import com.betteryanwo.entity.Goods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create by 六
 * Date:18-5-29
 */
public class GoodsTest extends BaseTest {
    @Autowired
    GoodsDao goodsDao;
    @Test
    /**
     * 测试分页查询所有
     */
    public void test(){
        List<Goods> goods = goodsDao.listGoods();
        for(Goods goods1:goods){
            System.out.println(goods1);
        }
    }
    /**
     * 根据商品类别和商品名称进行查询
     */
    @Test
    public void test1(){
        List<Goods> goods = goodsDao.listGoodsByTypeAndName("燕盏","燕盏6");
        for (Goods goods1:goods){
            System.out.println(goods1);
        }
    }
    /**
     * 商品库存
     */
    @Test
    public void test2(){
        goodsDao.CountGoods(1l);

    }
    /**
     * 减少库存
     */
    @Test
    public void test3(){
        int countGoods = goodsDao.UpdateCountGoods(2l,3);
        System.out.println(countGoods);
    }

    /**
     * 根据id得到商品信息
     */
    @Test
    public void test4(){
        Goods goods = goodsDao.getGoodsById(1L);
        System.out.println(goods);
    }
}
