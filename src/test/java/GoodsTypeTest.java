import com.betteryanwo.dao.GoodsTypeDao;
import com.betteryanwo.entity.GoodsType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create by 六
 * Date:18-5-29
 */
public class GoodsTypeTest extends BaseTest {
    @Autowired
    GoodsTypeDao goodsTypeDao;
    @Test
    public void test(){
        List<GoodsType> goodsTypes = goodsTypeDao.listGoodsType();
        for (GoodsType goodsType:goodsTypes
             ) {
            System.out.println(goodsType);
        }
    }
}
