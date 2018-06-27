import com.betteryanwo.dao.AddressDao;
import com.betteryanwo.entity.Address;
import com.betteryanwo.service.AddressService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-5-29
 */
public class AddressTest extends BaseTest{

    @Autowired
    AddressDao addressDao;
    @Test
    public void test(){

    }
    @Test
    public void test1(){
        List<Map<String, Long>> addressIdByUserId = addressDao.getAddressIdByUserId(2l);
        System.out.println(addressIdByUserId);
    }

    @Autowired
    AddressService addressService;
    @Test
    public void test2(){
        addressService.getAddressById(2l);
    }
    @Test
    public void test3(){
        Address address = new Address(null, 2l, "中国", "河南", "郑州", "管城", "郑州大学B211号", "六", "13588889999");
        addressDao.insertAddress(address);
    }
    @Test
    public void test4(){
        addressDao.delAddress(5l);
    }

    @Test
    public void test5(){
        addressDao.getAddressByAddressId(1l);
    }
    @Test
    public void test6(){
        Address address = new Address();
        address.setAddressId(8l);
        address.setCity("瓦尔登湖");
        addressDao.updateAddress(address);
    }
}
