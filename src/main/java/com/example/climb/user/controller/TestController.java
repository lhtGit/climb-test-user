package com.example.climb.user.controller;


import com.climb.common.bean.Result;
import com.climb.common.util.ResultUtil;
import com.example.climb.user.entity.Test;
import com.example.climb.user.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * (Test)表控制层
 *
 * @author lht
 * @since 2020-12-28 14:38:05
 */
@Api(tags = "Test Controller")
@RestController
@RequestMapping("test")
public class TestController {
    /**
     * 服务对象
     */
    @Resource
    private TestService testService;


    /**
     * 新增test数据
     * @author lht
     * @since  2020/12/28 16:16
     * @param id
     * @param name
     */
    @ApiOperation("test save")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "test id",required = true, dataTypeClass=Integer.class),
            @ApiImplicitParam(value = "test name",required = true, dataTypeClass=String.class),
    })
    @GetMapping("save")
    public Result<Boolean> save(Integer id,String name){
        Test test = new Test();
        test.setId(id);
        test.setName(name);
        return ResultUtil.success(testService.save(test));

    }
}