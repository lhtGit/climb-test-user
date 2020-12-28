package com.example.climb.user.controller;

import com.climb.common.bean.Result;
import com.climb.common.user.UserBaseInfo;
import com.climb.common.user.auth.LoginUserInfo;
import com.climb.common.util.ResultUtil;
import com.example.climb.user.vo.AuthorityInfoRes;
import com.example.climb.user.vo.UserDetailsRes;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author lht
 * @since 2020/12/28 16:18
 */
@RestController
@Slf4j
public class UserController {


    /**
     * 登录并返回用户信息
     * @author lht
     * @since  2020/12/28 16:24
     * @param loginUserInfo
     */
    @PostMapping("login")
    public Result<UserDetailsRes> loginAndUserDetails(@RequestBody LoginUserInfo loginUserInfo){
        log.info("loginAndUserDetails:{}",loginUserInfo);

        //用户基础信息
        UserBaseInfo userBaseInfo = new UserBaseInfo();
        userBaseInfo.setId("333");
        userBaseInfo.setEmail("xxxx@qq.com");
        userBaseInfo.setName("xxx");
        userBaseInfo.setUsername("xxxUsername");
        //装配用户详情
        UserDetailsRes userDetailsRes = new UserDetailsRes();
        //用户权限
        userDetailsRes.setAuthoritys(Lists.newArrayList("1","2","3"));
        userDetailsRes.setUserBaseInfo(userBaseInfo);

        return ResultUtil.success(userDetailsRes);
    }


    /**
     * 返回所有权限
     * @author lht
     * @since  2020/12/28 16:27
     */
    @GetMapping("auth/all")
    public Result<AuthorityInfoRes> getAuthorityAll(){
        AuthorityInfoRes authorityInfoRes = new AuthorityInfoRes();
        authorityInfoRes.setId("1");
        authorityInfoRes.setMethod("POST");
        authorityInfoRes.setName("测试权限");
        authorityInfoRes.setPath("/test/auth");
        return ResultUtil.success(Lists.newArrayList(authorityInfoRes));
    }
}
