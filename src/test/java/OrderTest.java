import com.betteryanwo.dao.OrderDao;
import com.betteryanwo.entity.Invoice;
import com.betteryanwo.entity.Order;
import com.betteryanwo.entity.OrderItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Create by 六
 * Date:18-5-29
 */
public class OrderTest extends BaseTest {
    @Autowired
    OrderDao orderDao;

    @Test
    public void test(){

        Invoice invoice = new Invoice();
        List<OrderItem> orderItems = new ArrayList<>();
        Order order = new Order(null, "123456", new BigDecimal(120000),
                1l, 0, new Date(), new Date(), "哈哈哈", 1, invoice, 1, 1, orderItems);
        orderDao.insert(order);
    }
    @Test
    public void test1(){
        Order order = new Order();
        order.setId(1l);
        order.setStatus(5);
        orderDao.update(order);
    }

    @Test
    public void delete(){
        orderDao.delete("123456");
    }
}
