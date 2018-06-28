import com.betteryanwo.dao.CartOrderDao;
import com.betteryanwo.entity.CartOrder;
import com.betteryanwo.entity.Goods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-6-27
 */
public class CartOrderTest extends BaseTest {
    @Autowired
    CartOrderDao cartOrderDao;

    @Test
    public void insert() {
        Goods goods = new Goods();
        goods.setGoodsId(1l);
        CartOrder cartOrder = new CartOrder(null,12,goods,new BigDecimal(240));
        cartOrderDao.insert(cartOrder);
    }

}
