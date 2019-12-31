package com.eq;

import com.pojo.User;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Author: zlp
 * Date: 2019-12-30 15:50
 * Description:张立朋，写点注释吧!!
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-mapper.xml"})
public class TestUser {

//    @Autowired
//    private UserService userService;
//    @Test
//    public void addUser(){
//        User user=new User();
//        user.setAddress("sadfasd");
//        user.setCreateTime(new Date());
//        user.setUpdateTime(new Date());
//        user.setPassword("12312312");
//        user.setNickName("adsgosdujhgos");
//        user.setUserName("封神");
//        Integer result = userService.addUser(user);
//        System.out.println(result);
//    }
//
//    @Test
//    public void findUserByName(){
//        List<User> a = userService.findUserByUserName("张立朋");
//        System.out.println(a);
//    }
//
//    @Test
//    public void updateUser(){
//        User user = new User();
//        user.setUserName("封神榜");
//        user.setAddress("陕西省");
//        Integer result = userService.updateUser(user);
//        System.out.println(result);
//    }
//
//    @Test
//    public void deleteUser(){
//
//    }
}
