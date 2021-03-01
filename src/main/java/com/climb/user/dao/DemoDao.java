package com.climb.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.climb.user.entity.Demo;
import org.springframework.stereotype.Repository;

/**
 * (Test)表数据库访问层
 *
 * @author lht
 * @since 2020-12-28 14:38:03
 */
@Repository
public interface DemoDao extends BaseMapper<Demo> {


}