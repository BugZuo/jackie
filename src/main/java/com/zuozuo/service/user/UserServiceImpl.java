package com.zuozuo.service.user;

import com.zuozuo.service.dao.mysql.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zuozuo on 15-8-14.
 */
public class UserServiceImpl implements IUserService {

    private UserDAO userDAO;

    public String getNameById(long id) {
        return userDAO.getNameById(id);
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }
}
