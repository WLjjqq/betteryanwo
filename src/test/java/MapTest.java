import java.util.HashMap;
import java.util.Map;

/**
 * Create by 六
 * Date:18-6-12
 */
public class MapTest {


    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("he",123);
        map.put("shen",456);
        Object he = map.get("he");
        System.out.println(he); //输出123.
    }

}
