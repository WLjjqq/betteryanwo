package com.betteryanwo.service.impl;

import com.betteryanwo.dao.UsersDao;
import com.betteryanwo.domain.SessionUser;
import com.betteryanwo.entity.User;
import com.betteryanwo.entity.Users;
import com.betteryanwo.exception.LoginException;
import com.betteryanwo.service.UsersService;
import com.betteryanwo.util.SessionUtil;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;
   /* @Override
    public Users getByUserName(Users users) {

        return usersDao.getByUserName(users);
    }

    @Override
    public Object loginUser(Users u) {
            Map<String,Object> map=new HashMap<String,Object>();
            if(usersDao.getByUserName(u)==null){
                map.put("success", false);
                map.put("message", "用户名不存在！");
            }else{
                if(usersDao.getByUserPwd(u)==null){
                    this.UserPwdLockNum(u);
                    map.put("success", false);
                    map.put("message", "密码错误！请重新输入");
                }else{
                    map.put("success", true);
                    map.put("message", "登陆成功！");
                    map.put("user", usersDao.getByUserName(u));
                }
            }
            return map;
        }

    public Object UserPwdLockNum(Users u){
        Users user=usersDao.getByUserName(u);//查询出当前登录的对象
        return user;
    }

    @Override
    public Users selectUserPwdByUserName(Users u) {

        return usersDao.getByUserPwd(u);
    }*/


    @Override
    public Users getById(Long id) {
        return usersDao.getById(id);
    }

    @Override
    public Users getByEmail(String email) {
        return usersDao.getByEmail(email);
    }

    @Override
    public Users getByUserPassword(Users users) {
        return usersDao.getByUserPassword(users);
    }


  /* @Override
    public SessionUser login(HttpServletRequest request, Users users ) {
        Users u=usersDao.getByUserPassword(users);
        Users email=usersDao.getByEmail(u.getEmail());
        if (StringUtils.isEmpty(u.getUserName())){
            throw new LoginException("用户名或密码不能为空！");
        }
        if (StringUtils.isEmpty(u.getUserPassword())){
            throw new LoginException("用户名或密码不能为空！");
        }
        if (email==null){
            throw new LoginException("用户名、密码输入不正确！");
        }
        return SessionUtil.convertToSessionUsers(u);
    }*/

    /**
     * Created by mamengna on 2018/6/1 9:40
     * Description：登录
     */

   @Override
   public Users login(Users users) {
       Users u=usersDao.getByUserPassword(users);
       String ze="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
       if (StringUtils.isEmpty(users.getEmail())){
           throw new LoginException("用户名或密码不能为空！");
       }
       if (StringUtils.isEmpty(users.getUserPassword())){
           throw new LoginException("用户名或密码不能为空！");
       }
       if(!users.getEmail().matches(ze)){
           throw new LoginException("邮箱格式不正确！");
       }
       if (u==null){
           throw new LoginException("用户或密码不正确！");
       }
      /* if (users.getUserPassword()==null){
           throw new LoginException("密码输入错误，请重新输入");
       }*/
       return u;
   }

}
