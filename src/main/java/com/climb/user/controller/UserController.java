package com.climb.user.controller;

import com.climb.common.bean.Result;
import com.climb.common.user.auth.LoginUserInfo;
import com.climb.common.user.bean.MenuInfo;
import com.climb.common.user.bean.ResourceInfo;
import com.climb.common.user.bean.Roleinfo;
import com.climb.common.user.bean.UserInfoDetails;
import com.climb.common.util.ResultUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

        UserInfoDetails userInfoDetails = new UserInfoDetails();
        MenuInfo defaultMenuInfo = new MenuInfo();
        defaultMenuInfo.setIcon("icon");
        defaultMenuInfo.setId("1");
        defaultMenuInfo.setName("menu name");
        defaultMenuInfo.setParentId("0");
        userInfoDetails.setMenuInfo(Lists.newArrayList(defaultMenuInfo));

        ResourceInfo resourceInfo = new ResourceInfo();
        resourceInfo.setId("1");
        resourceInfo.setMethod("GET");
        resourceInfo.setName("resource name");
        resourceInfo.setPath("/test");
        userInfoDetails.setResourceInfo(Lists.newArrayList(resourceInfo));

        Roleinfo roleinfo = new Roleinfo();
        roleinfo.setId("1");
        roleinfo.setName("role name");
        userInfoDetails.setRoleInfo(Lists.newArrayList(roleinfo));

        userInfoDetails.setId("1");
        userInfoDetails.setMail("test@qq.com");
        userInfoDetails.setName("admin nick");
        userInfoDetails.setPhone("1531515531");
        userInfoDetails.setUsername("admin");
        userInfoDetails.setGender(1);
        userInfoDetails.setBirthday(new Date());
        return ResultUtil.success(userInfoDetails);
    }


    /**
     * 返回所有权限
     * @author lht
     * @since  2020/12/28 16:27
     */
    @GetMapping("auth/all")
    public Result<ResourceInfo> getAuthorityAll(){
        ResourceInfo resourceInfo = new ResourceInfo();
        resourceInfo.setId("1");
        resourceInfo.setMethod("POST");
        resourceInfo.setName("测试权限");
        resourceInfo.setPath("/test/auth");
        return ResultUtil.success(Lists.newArrayList(resourceInfo));
    }
}
