package com.example.climb.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.climb.user.entity.Test;
import org.springframework.stereotype.Repository;

/**
 * (Test)表数据库访问层
 *
 * @author lht
 * @since 2020-12-28 14:38:03
 */
@Repository
public interface TestDao extends BaseMapper<Test> {


}