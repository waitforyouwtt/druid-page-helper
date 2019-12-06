package com.yidiandian.dao.master;

import com.yidiandian.entity.UserInfo;
import com.yidiandian.view.RequestUserInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/5 14:21
 * @Email: 15290810931@163.com
 */
@Mapper
public interface UserInfoMapper {

    List<UserInfo> findList(RequestUserInfo requestUserInfo);
}
