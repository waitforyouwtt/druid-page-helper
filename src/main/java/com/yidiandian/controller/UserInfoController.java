package com.yidiandian.controller;

import com.github.pagehelper.PageInfo;
import com.yidiandian.entity.UserInfo;
import com.yidiandian.service.UserInfoService;
import com.yidiandian.view.RequestUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/5 14:29
 * @Email: 15290810931@163.com
 */
@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/findList")
    public String findList(RequestUserInfo userInfo){
        PageInfo<UserInfo> list = userInfoService.findList(userInfo);
        return "ok";
    }

    @PostMapping("/findAll")
    public PageInfo<UserInfo> findAll(@RequestBody RequestUserInfo userInfo){
        PageInfo<UserInfo> list = userInfoService.findList(userInfo);
        return list;
    }
}
