package com.xunqi.gulimall.cart.to;

import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-06-30 17:35
 **/

@Data
public class UserInfoTo {

    private Long userId;

    private String userKey;

    /**
     * 是否有临时用户  这个属性的作用是对于首次没有临时用户的话，创建key，用这个key操作，并添加临时用户到cookie中
     */
    private Boolean tempUser = false;

}
