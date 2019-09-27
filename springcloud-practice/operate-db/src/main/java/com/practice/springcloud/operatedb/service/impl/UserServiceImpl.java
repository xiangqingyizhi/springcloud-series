package com.practice.springcloud.operatedb.service.impl;

import com.practice.springcloud.model.User;
import com.practice.springcloud.operatedb.mapper.UserMapper;
import com.practice.springcloud.operatedb.service.UserService;
import com.practice.springcloud.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: XF
 * @Date: 2019-09-27 17:49
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultData saveUser(User user) {
        int result = userMapper.insert(user);
        return new ResultData();
    }
}
