import com.betteryanwo.dao.OrderLogDao;
import com.betteryanwo.entity.OrderLog;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Create by 六
 * Date:18-6-13
 */
public class OrderLogDaoTest extends BaseTest {
    @Autowired
    OrderLogDao orderLogDao;

    @Test
    public void test() {
        OrderLog orderLog = new OrderLog();
        orderLog.setOperateDate(new Date());
        orderLog.setType("1");
        orderLog.setOperator("系统");
        orderLog.setOrderSerial("SSY-20180613022");
        orderLogDao.insert(orderLog);
    }
    @Test
    public void test1(){
        orderLogDao.getByOrderSerial("SSY-20180613022");
    }
}
