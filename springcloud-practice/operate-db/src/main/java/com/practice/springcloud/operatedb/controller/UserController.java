package com.practice.springcloud.operatedb.controller;

import com.practice.springcloud.model.User;
import com.practice.springcloud.operatedb.service.UserService;
import com.practice.springcloud.utils.ResultData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: XF
 * @Date: 2019-09-27 17:46
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResultData save(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
