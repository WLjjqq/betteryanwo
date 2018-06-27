package com.betteryanwo.service.impl;

import com.betteryanwo.dao.UsersDao;
import com.betteryanwo.entity.Users;
import com.betteryanwo.exception.LoginException;
import com.betteryanwo.service.UsersService;
import com.betteryanwo.util.PasswordHash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.security.SecureRandom;


@Service
public class UsersServiceImpl implements UsersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);
    @Autowired
    private UsersDao usersDao;


    String email="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    String phone="^((\\+)?86|((\\+)?86)?)0?1[3458]\\d{9}$|^(((0\\d2|0\\d{2})[- ]?)?\\d{8}|((0\\d3|0\\d{3})[- ]?)?\\d{7})(-\\d{3})?$";
    String pwd="^[0-9A-Za-z]+$";
    String cardId="(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
    String realName="^[\\u4e00-\\u9fa5]+$";

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
    /**
     * Created by mamengna on 2018/6/1 9:40
     * Description：登录
     */

   @Override
   public Users login(Users users) {
       Users u=usersDao.getByUserPassword(users);
       String password=users.getUserPassword();
       if (StringUtils.isEmpty(users.getEmail())){
           throw new LoginException("用户名或密码不能为空！");
       }
       if (StringUtils.isEmpty(users.getUserPassword())){
           throw new LoginException("用户名或密码不能为空！");
       }
       if(!users.getEmail().matches(email)){
           throw new LoginException("邮箱格式不正确！");
       }

       try {
           if (!PasswordHash.validatePassword(password, u.getUserPassword())) {
               LOGGER.info("Email:{} use the wrong email or password login with {}",email);
               throw new LoginException("用户名或密码不正确");
           }
       }catch (Exception e){
           e.getMessage();
       }

       if (u==null){
           throw new LoginException("用户或密码不正确！");
       }
      /* if (users.getUserPassword()==null){
           throw new LoginException("密码输入错误，请重新输入");
       }*/
       return u;
   }

  public int insertUser(Users users){
       String password=users.getUserPassword();
       int u=0;
      if (StringUtils.isEmpty(users.getEmail())){
          throw new LoginException("邮箱不能为空！");
      }
      if (StringUtils.isEmpty(users.getUserName())){
          throw new LoginException("用户名不能为空！");
      }
      if (StringUtils.isEmpty(users.getRealName())){
          throw new LoginException("姓名不能为空！");
      }
      if (StringUtils.isEmpty(users.getUserPassword())){
          throw new LoginException("密码不能为空！");
      }
      if (StringUtils.isEmpty(users.getCardId())){
          throw new LoginException("身份证号码不能为空！");
      }
      if (StringUtils.isEmpty(users.getPhone())){
          throw new LoginException("电话不能为空！");
      }

      if(!users.getEmail().matches(email)){
          throw new LoginException("邮箱格式不正确！");
      }
      if(!users.getUserPassword().matches(pwd)){
          throw new LoginException("密码格式不正确！");
      }
      if(!users.getRealName().matches(realName)){
          throw new LoginException("姓名格式不正确！");
      }
      if(!users.getCardId().matches(cardId)){
          throw new LoginException("身份证号格式不正确！");
      }
      if(!users.getPhone().matches(phone)){
          throw new LoginException("联系电话格式不正确！");
      }
      try {
          SecureRandom random = new SecureRandom();
          byte[] salt = new byte[24];
          random.nextBytes(salt);
          String saltHex = PasswordHash.toHex(salt);
          String hashPwd = PasswordHash.createHash(password + saltHex);
          System.out.println("======================"+hashPwd);
          System.out.println("======================"+saltHex);
          users.setUserPassword(hashPwd);
          u=usersDao.insertUser(users);
          return u;
      }catch (Exception e){
          e.getMessage();
      }
      return u;
   }

}
