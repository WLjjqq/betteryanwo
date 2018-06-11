package com.betteryanwo.dao;
import com.betteryanwo.entity.Users;

/**
 * @author :MaMengna
 * @Date :Create in 9:52 2018/5/29
 */
public interface UsersDao {
    /**
     * Created by mamengna on 2018/5/29 10:06
     * Description：登录
     */
    Users  userLogin(Users users);

    Users getById(Long id);
    Users getByEmail(String email);

    /**
     * Created by mamengna on 2018/5/30 9:42
     * Description：查询密码
     */
    Users getByUserPassword(Users users);

}
