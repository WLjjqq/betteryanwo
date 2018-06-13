import com.betteryanwo.dao.PayOrderDao;
import com.betteryanwo.entity.PayOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Create by 六
 * Date:18-6-6
 */
public class PayOrderDaoTest extends BaseTest {
    @Autowired
    PayOrderDao payOrderDao;

    @Test
    public void test(){
        PayOrder payOrder = new PayOrder(4, 1l, "120000",
                0, "中国银行", "62178909", new Date(), new Date(),
                "支付接口", "支付宝");
        payOrderDao.insertPayOrder(payOrder);
    }

    /*@Test
    public void test2(){
        payOrderDao.updatePayStatus(2, 1, 0);

    }*/
    @Test
    public void test1(){
        PayOrder payOrder = new PayOrder();
        payOrder.setId(1);
        payOrder.setStatus(2);
        payOrderDao.update(payOrder);
    }
}
