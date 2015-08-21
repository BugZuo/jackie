package com.zuozuo.service.impl;

import com.zuozuo.service.IUserService;
import com.zuozuo.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zuozuo on 15-8-14.
 */
public class UserServiceImpl implements IUserService {

//    private UserDAO userDAO;

//    @Autowired
//    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserDAO userDAO;

    public String getNameById(long id) {
        return userDAO.getNameById(id);
    }

//    public void setUserDAO(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    public UserDAO getUserDAO() {
//        return userDAO;
//    }
}
