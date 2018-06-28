import com.betteryanwo.dao.UsersDao;
import com.betteryanwo.entity.Users;
import com.betteryanwo.service.UsersService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Create by 六
 * Date:18-6-27
 */
public class UserTest extends BaseTest {
    @Autowired
    UsersService usersService;
    @Autowired
    UsersDao usersDao;
    @Test
    public void insert(){
        Users record = new Users(9l,"豆豆","豆豆","男","123456","123@qq.com","13288889999","412821199409098090",null,null,1l);
        usersService.insertUser(record);
    }
}
