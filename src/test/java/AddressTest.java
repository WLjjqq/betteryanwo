import com.betteryanwo.dao.AddressDao;
import com.betteryanwo.entity.Address;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by 六
 * Date:18-5-29
 */
public class AddressTest extends BaseTest{

    @Autowired
    AddressDao addressDao;
    @Test
    public void test(){
        Address address = addressDao.getAddressById(1l);
        System.out.println(address);
    }
    @Test
    public void test1(){
        long addressIdByUserId = addressDao.getAddressIdByUserId(1l);
        System.out.println(addressIdByUserId);
    }
}
