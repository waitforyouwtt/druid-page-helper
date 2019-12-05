package com.yidiandian.view;

import com.yidiandian.utils.PageHelps;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/5 15:06
 * @Email: 15290810931@163.com
 */
@Data
public class RequestUserInfo extends PageHelps implements Serializable {

    private Integer id;

    private String name;

    private int age;
}
