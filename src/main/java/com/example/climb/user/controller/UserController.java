package com.example.climb.user.controller;

import com.climb.common.bean.Result;
import com.climb.common.user.UserBaseInfo;
import com.climb.common.user.auth.LoginUserInfo;
import com.climb.common.user.bean.UserInfoDetails;
import com.climb.common.user.bean.base.DefaultMenuInfo;
import com.climb.common.user.bean.base.DefaultResourceInfo;
import com.climb.common.user.bean.base.DefaultRoleinfo;
import com.climb.common.user.bean.base.DefaultUserInfoDetails;
import com.climb.common.util.ResultUtil;
import com.example.climb.user.vo.AuthorityInfoRes;
import com.example.climb.user.vo.UserDetailsRes;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
    public Result<UserInfoDetails> loginAndUserDetails(@RequestBody LoginUserInfo loginUserInfo){
        log.info("loginAndUserDetails:{}",loginUserInfo);

        DefaultUserInfoDetails userInfoDetails = new DefaultUserInfoDetails();
        DefaultMenuInfo defaultMenuInfo = new DefaultMenuInfo();
        defaultMenuInfo.setIcon("icon");
        defaultMenuInfo.setId("1");
        defaultMenuInfo.setName("menu name");
        defaultMenuInfo.setParentId("0");
        userInfoDetails.setMenuInfo(Lists.newArrayList(defaultMenuInfo));

        DefaultResourceInfo resourceInfo = new DefaultResourceInfo();
        resourceInfo.setId("1");
        resourceInfo.setMethod("GET");
        resourceInfo.setName("resource name");
        resourceInfo.setPath("/test");
        userInfoDetails.setResourceInfo(Lists.newArrayList(resourceInfo));

        DefaultRoleinfo roleinfo = new DefaultRoleinfo();
        roleinfo.setId("1");
        roleinfo.setName("role name");
        userInfoDetails.setRoleInfo(Lists.newArrayList(roleinfo));

        userInfoDetails.setId("1");
        userInfoDetails.setMail("test@qq.com");
        userInfoDetails.setName("admin nick");
        userInfoDetails.setPhone("1531515531");
        userInfoDetails.setUsername("admin");
        userInfoDetails.setGender(1);
        return ResultUtil.success(userInfoDetails);
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
