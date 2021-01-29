package com.example.climb.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.climb.common.bean.Result;
import com.climb.common.util.ResultUtil;
import com.climb.mybatis.util.Pageable;
import com.example.climb.user.dao.TestDao;
import com.example.climb.user.entity.Test;
import com.example.climb.user.feign.DemoFiegn;
import com.example.climb.user.service.TestService;
import io.seata.spring.annotation.GlobalTransactional;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


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


    @Autowired
    private DemoFiegn demoFiegn;

    @Autowired
    private TestDao testDao;
    /**
     * 测试seata分布式事务
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
    @GlobalTransactional
    public Result<Boolean> save(Integer id,String name){
        Test test = new Test();
        test.setId(id);
        test.setName(name);
        testService.save(test);
        String o = demoFiegn.get();

        if(1==1)throw new RuntimeException("test exception");
        return ResultUtil.success();

    }

    /**
     * 测试对baseMapper增强的 添加共享锁 select     * @author lht
     * @since  2021/1/29 9:01
     * @param id
     * @param name
     */
    @GetMapping("shareSelect")
    public List<Test> shareSelect(String id,String name){
        Test test = null;

        if(!StringUtils.isEmpty(name)){
            test= new Test();
            test.setName(name);
        }
        LambdaQueryWrapper<Test> testLambdaQueryWrapper = new LambdaQueryWrapper<>(test);
        testLambdaQueryWrapper.eq(Test::getId,id);
        Page<Test> page  = testDao.selectPage(Pageable.page(1,1),null);
       return testDao.shareSelectList(testLambdaQueryWrapper);
    }
}