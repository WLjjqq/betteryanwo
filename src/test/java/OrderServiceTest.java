import com.betteryanwo.entity.Order;
import com.betteryanwo.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by 六
 * Date:18-6-4
 */
public class OrderServiceTest extends BaseTest{
    @Autowired
    OrderService orderService;
    @Test
    public void test(){
        orderService.insert(2l,"664129042",1);
    }
    @Test
    public void test1(){
        orderService.deleteOrder(48l,"664129041");
    }
    @Test
    public void test2(){
        Order order = new Order();
        order.setShoppingStatus(1);
        order.setId(35l);
        orderService.updateOrder(order);
    }
}
