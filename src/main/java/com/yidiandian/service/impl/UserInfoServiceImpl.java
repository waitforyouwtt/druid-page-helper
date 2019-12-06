package com.yidiandian.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yidiandian.dao.master.UserInfoMapper;
import com.yidiandian.entity.UserInfo;
import com.yidiandian.service.UserInfoService;
import com.yidiandian.view.RequestUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/5 14:14
 * @Email: 15290810931@163.com
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoDao;

    /**
     * 查询用户集合
     *
     * @return
     */
    @Override
    public PageInfo<UserInfo> findList(RequestUserInfo requestUserInfo) {
        PageInfo<UserInfo> pageInfo = null;
        try {
            Page<?> page = PageHelper.startPage(requestUserInfo.getPageNum(),requestUserInfo.getPageSize());
            //log.info("设置第一页两条数据,请求参数pageNum：{},pageSize:{}",requestUserInfo.getPageNum(),requestUserInfo.getPageSize());
            List<UserInfo> list = userInfoDao.findList(requestUserInfo);
            pageInfo = new PageInfo<>(list);
            //log.info("总共有:{}",page.getTotal()+"条数据,实际返回{}:",list.size()+"两条数据!");
        } catch (Exception e) {
            log.error("查询失败"+e.getMessage());
        }
        return pageInfo;
    }
}
