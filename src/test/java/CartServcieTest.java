import com.betteryanwo.service.CartItemService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


/**
 * Create by 六
 * Date:18-6-1
 */
public class CartServcieTest extends BaseTest {
    @Autowired
    CartItemService cartItemService;
    @Test
    public void test(){
        List<Map<String, Object>> maps = cartItemService.getNumAndPrice(3l, 3l);
        Object num=null;
        Object itemNum=null;
        Object id=null;
        for(Map map:maps){
             num= map.get("num");
             itemNum = map.get("itemNum");
             id = map.get("id");
        }
        System.out.println(num+" "+ itemNum+" "+id);
    }
}
