import com.betteryanwo.entity.Goods;
import com.betteryanwo.entity.OrderItem;
import com.betteryanwo.service.OrderItemService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Create by 六
 * Date:18-6-9
 */
public class OrderItemServiceTest extends BaseTest {
    @Autowired
    OrderItemService orderItemService;

    @Test
    public void test() {
        Goods goods = new Goods();
        goods.setGoodsId(1l);
        Goods goods1 = new Goods();
        goods1.setGoodsId(2l);
        Goods goods2 = new Goods();
        goods2.setGoodsId(3l);
        Goods goods3 = new Goods();
        goods3.setGoodsId(4l);
        OrderItem orderItem11 = new OrderItem(null, 4, 9l, new BigDecimal(4000), goods);
        OrderItem orderItem22= new OrderItem(null, 5, 9l, new BigDecimal(5000), goods1);
        OrderItem orderItem33 = new OrderItem(null, 6, 9l, new BigDecimal(6000), goods2);
        OrderItem orderItem44 = new OrderItem(null, 7, 9l, new BigDecimal(7000), goods3);
        ArrayList<OrderItem> orderItems  = new ArrayList<>();
        orderItems.add(orderItem11);
        orderItems.add(orderItem22);
        orderItems.add(orderItem33);
        orderItems.add(orderItem44);
        orderItemService.insertList(orderItems);
    }
    @Test
    public void test1(){
        orderItemService.deleteByOrderId(3l);
    }
}
