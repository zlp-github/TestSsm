package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Author: zlp
 * Date: 2019-12-30 18:28
 * Description:张立朋，写点注释吧!!
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer addUser(User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return userDao.addUser(user);
    }

    @Override
    public List<User> findUserByUserName(String name) {
        return userDao.findUserByUserName(name);
    }

    @Override
    public Integer updateUser(User user) {
        user.setUpdateTime(new Date());
        return userDao.updateUser(user);
    }

    @Override
    public Integer deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }
}
