package com.example.climb.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


/**
 * (Test)
 *
 * @author lht
 * @since 2020-12-28 14:38:03
 */
@Data
@TableName("test")
public class Test implements Serializable {
    private static final long serialVersionUID = 449598473768475608L;

    @TableId("id")
    private Integer id;


    @TableField("name")
    private String name;
    @TableField("age")
    private Integer age;
    @TableField("time")
    private Integer time;


}