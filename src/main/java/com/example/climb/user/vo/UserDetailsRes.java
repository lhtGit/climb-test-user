package com.example.climb.user.vo;

import com.climb.common.user.UserBaseInfo;
import lombok.Data;

import java.util.Collection;

/**
 * 用户信息
 * @author lht
 * @since 2020/12/28 16:19
 */
@Data
public class UserDetailsRes {

    private UserBaseInfo userBaseInfo;


    private Collection<String> authoritys;

}
