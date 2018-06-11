import com.betteryanwo.entity.Goods;
import com.betteryanwo.service.GoodsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create by 六
 * Date:18-5-29
 */
public class GoodsServiceTest extends BaseTest {
    @Autowired
    GoodsService goodsService;
    @Test
    public void test(){
        List<Goods> goods = goodsService.listGoodsByTypeAndName("燕盏", "燕盏3");
        for (Goods g:goods){
            System.out.println(g);
        }
    }
}
