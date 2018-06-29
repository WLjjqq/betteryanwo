import com.betteryanwo.entity.Order;
import com.betteryanwo.entity.OrderItem;
import com.betteryanwo.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-4
 */
public class OrderServiceTest extends BaseTest{
    @Autowired
    OrderService orderService;
    @Test
    public void test(){
        orderService.insert(2l,"664129042",0);
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
    @Test
    public void test3(){
        Order order = orderService.getOrderByOrderSerial("664129043");
        List<OrderItem> orderItems = order.getOrderItems();
        for(OrderItem orderItem:orderItems){
            System.out.println(orderItem);
        }
    }
}
