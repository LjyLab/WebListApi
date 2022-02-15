package com.ljy.demo.domain;

import lombok.Data;

import java.util.List;

/**
 * @Author XiaoJun
 * @Create 2022-02-15 16:00
 * @Desc
 * @Application
 **/
@Data
public class Index {
    private Dept dept;
    private List<User> userList;
}
