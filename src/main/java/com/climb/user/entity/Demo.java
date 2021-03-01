package com.climb.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lht
 * @since 2021/1/28 16:49
 */
@Data
@TableName("demo")
public class Demo {

    @TableId("id")
    private Integer id;


    @TableField("name")
    private String name;

}
