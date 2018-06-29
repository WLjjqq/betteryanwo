
import java.util.ArrayList;
import java.util.List;

/**
 * Create by 六
 * Date:18-6-21
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        if(  null!=list || list.isEmpty() || list.size()!=0 ){
            System.out.println("三个条件都是真的。");
            System.out.println(list.size());
        }else {
            System.out.println(list.size());
        }
    }
}
