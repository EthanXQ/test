package com.ethan.manage.controller;

import com.ethan.pojo.User;
import com.ethan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ethan on 2017/4/25.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("showUser/{userId}")
    @ResponseBody
    public User getUser(@PathVariable("userId") Long userId){
        System.out.println();

        User user = userService.getById(userId);
        return user;
    }

}
