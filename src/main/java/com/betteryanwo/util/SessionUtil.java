package com.betteryanwo.util;

import com.betteryanwo.dao.UsersDao;
import com.betteryanwo.domain.SessionUser;
import com.betteryanwo.entity.User;
import com.betteryanwo.entity.Users;
import com.betteryanwo.service.UsersService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 辉太郎 on 2017/8/29.
 */
public class SessionUtil {

    private final static String SESSION_USER = "session_user";
    private final static String IS_LOGIN = "is_login";

    public static SessionUser getSessionUser(HttpServletRequest request) {
        return (SessionUser) request.getSession().getAttribute(SESSION_USER);

    }

    public static void setSessionUser(HttpServletRequest request, SessionUser user) {
        request.getSession().setAttribute(SESSION_USER, user);
    }

    public static void invalidate(HttpServletRequest request) {
        setSessionUser(request, null);
    }

    public static User convertToUser(SessionUser sessionUser, UsersDao usersDao) {
        if (sessionUser != null && usersDao != null) {
            Long id = sessionUser.getId();
           // Users users = usersDao.getById(id);
            return null;
        }
        return null;
    }


    public static User convertToUser(SessionUser sessionUser, UsersService usersService) {
        if (sessionUser != null && usersService != null) {
            Long id = sessionUser.getId();
            //User user = usersService.getById(id);
            return null;
        }
        return null;
    }

/*    public static SessionUser convertToSessionUser(User user) {
        if (user != null && user.getId() != null) {
            SessionUser sessionUser = new SessionUser();
            sessionUser.setId(user.getId());
            sessionUser.setEmail(user.getEmail());
            sessionUser.setUsername(user.getUsername());
            sessionUser.setLastLogin(user.getLastLogin());
            sessionUser.setLastLoginFrom(user.getLastLoginFrom());
            sessionUser.setMobile(user.getMobile());
            sessionUser.setDateCreated(user.getDateCreated());
            sessionUser.setStatus(user.getStatus());
            sessionUser.setTestCount(user.getTestCount());
            return sessionUser;
        }
        return null;
    }*/



    public static SessionUser convertToSessionUsers(Users users) {
        if (users != null && users.getUserId() != null) {
            SessionUser sessionUser = new SessionUser();
            sessionUser.setId(users.getUserId());
            sessionUser.setUsername(users.getUserName());
            return sessionUser;
        }
        return null;
    }
}
