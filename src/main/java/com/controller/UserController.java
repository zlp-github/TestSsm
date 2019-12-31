package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zlp
 * Date: 2019-12-30 11:33
 * Description:张立朋，写点注释吧!!
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "add/user",produces = "text/html;charset=utf-8")
    public String addUser(User user){
        Integer result = userService.addUser(user);
        if(result.equals(1)){
            return "用户注册成功";
        }else{
            return "注册失败";
        }
    }
    @PostMapping(value = "update/user", produces = "text/html;charset=utf-8")
    public String update(User user){
        Integer result = userService.updateUser(user);
        if (result.equals(1)){
            return "用户更新成功";
        }else {
            return "更新失败";
        }
    }
}
