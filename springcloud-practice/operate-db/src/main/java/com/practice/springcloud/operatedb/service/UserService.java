package com.practice.springcloud.operatedb.service;

import com.practice.springcloud.model.User;
import com.practice.springcloud.utils.ResultData;

/**
 * @Auther: XF
 * @Date: 2019-09-27 17:48
 * @Description:
 */
public interface UserService {

    public ResultData saveUser(User user);
}
