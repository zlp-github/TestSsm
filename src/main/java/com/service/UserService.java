package com.service;

import com.pojo.User;

import java.util.List;

/**
 * Author: zlp
 * Date: 2019-12-30 15:48
 * Description:张立朋，写点注释吧!!
 */
public interface UserService {

    Integer addUser(User user);
    List<User> findUserByUserName(String name);
    Integer updateUser(User user);
    Integer deleteUser(Long id);
    User findUserById(Long id);
}

