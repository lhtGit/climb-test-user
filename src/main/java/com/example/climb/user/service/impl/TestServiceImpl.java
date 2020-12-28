package com.example.climb.user.service.impl;

import com.climb.mybatis.service.ExtensionServiceImpl;
import com.example.climb.user.dao.TestDao;
import com.example.climb.user.entity.Test;
import com.example.climb.user.service.TestService;
import org.springframework.stereotype.Service;

/**
 * (Test)表服务实现类
 *
 * @author lht
 * @since 2020-12-28 14:38:03
 */
@Service
public class TestServiceImpl extends ExtensionServiceImpl<TestDao, Test> implements TestService {

}