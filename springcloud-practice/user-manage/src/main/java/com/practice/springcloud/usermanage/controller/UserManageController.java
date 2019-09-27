package com.practice.springcloud.usermanage.controller;

import com.practice.springcloud.model.User;
import com.practice.springcloud.usermanage.feign.UserFeign;
import com.practice.springcloud.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: XF
 * @Date: 2019-09-27 18:39
 * @Description:
 */
@RestController
@RequestMapping("/manage")
public class UserManageController {

    @Autowired
    private UserFeign userFeign;

    @PostMapping("/save")
    public ResultData save(@RequestBody User user){
        return userFeign.save(user);
    }
}
