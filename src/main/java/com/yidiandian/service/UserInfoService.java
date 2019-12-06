package com.yidiandian.service;

import com.github.pagehelper.PageInfo;
import com.yidiandian.entity.UserInfo;
import com.yidiandian.view.RequestUserInfo;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/5 14:13
 * @Email: 15290810931@163.com
 */
public interface UserInfoService {

    /**
     * 查询用户集合
     * @return
     */
    PageInfo<UserInfo> findList(RequestUserInfo requestUserInfo);
}
