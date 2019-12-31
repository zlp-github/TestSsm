package com.dao;

import com.mapper.UserMapper;
import com.pojo.User;
import com.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: zlp
 * Date: 2019-12-30 15:38
 * Description:张立朋，写点注释吧!!
 */
@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     */
    public Integer addUser(User user){
        return userMapper.insert(user);
    }

    /**
     * 通过用户名查找
     */
    public List<User> findUserByUserName(String name){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameLike("%"+name+"%");
        return userMapper.selectByExample(userExample);
    }

    /**
     * 通过id对用户信息进行更新
     */
    public Integer updateUser(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 通过id对用户进行删除
     */
    public Integer deleteUser(Long id){
        return userMapper.deleteByPrimaryKey(id);
    }

    /**
     * 通过id进行查找
     */
    public User findUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
