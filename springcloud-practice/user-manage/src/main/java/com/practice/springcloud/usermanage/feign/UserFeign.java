package com.practice.springcloud.usermanage.feign;

import com.practice.springcloud.model.User;
import com.practice.springcloud.utils.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: XF
 * @Date: 2019-09-27 18:18
 * @Description:
 */
@FeignClient(value = "OPERATE-DB")
@RequestMapping("/operateDb/user")
public interface UserFeign {

    @PostMapping("/save")
    ResultData save(@RequestBody User user);
}
