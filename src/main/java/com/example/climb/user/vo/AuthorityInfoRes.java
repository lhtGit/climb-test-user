package com.example.climb.user.vo;

import lombok.Data;

/**
 * 权限信息
 * @author lht
 * @since 2020/12/28 16:25
 */
@Data
public class AuthorityInfoRes {
    /**
     * 权限标识符
     */
    private String id;
    /**
     * 资源名称
     */

    private String name;
    /**
     * url
     */

    private String path;
    /**
     * 请求类型
     */

    private String method;
}
