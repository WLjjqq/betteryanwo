import com.betteryanwo.entity.PayOrder;
import com.betteryanwo.service.PayOrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Create by 六
 * Date:18-6-7
 */
public class PayOrderServiceTest extends BaseTest{
    @Autowired
    PayOrderService payOrderService;
    @Test
    public void test(){
        PayOrder payOrder = new PayOrder(3, 1l, "120000",
                0, "中国银行", "62178909", new Date(), new Date(),
                "支付接口", "微信");
        payOrderService.insertPayOrder(payOrder);
    }
}
