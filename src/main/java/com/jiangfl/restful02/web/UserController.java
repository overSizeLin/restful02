package com.jiangfl.restful02.web;

import com.jiangfl.restful02.bean.User;
import com.jiangfl.restful02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/com/jiangfl")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userName", method = RequestMethod.GET)
    public User findByUserName(@RequestParam(value = "userName") String userName) {
        System.out.println("开始查询...");
        return userService.selectUserByname(userName);
    }


    @RequestMapping(value = "/users/{username}",method = RequestMethod.GET)
    public User getUser(@PathVariable String username) {
        return userService.selectUserByname(username);
    }

}
