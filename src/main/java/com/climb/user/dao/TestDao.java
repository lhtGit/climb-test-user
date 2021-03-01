package com.climb.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.climb.user.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * (Test)表数据库访问层
 *
 * @author lht
 * @since 2020-12-28 14:38:03
 */
@Repository
public interface TestDao extends BaseMapper<Test> {


    List<Test> shareSelect();
    int updateAll();
}