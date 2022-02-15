package com.ljy.demo.dao;

import com.ljy.demo.domain.User;

import java.util.List;

public interface IndexMapper {

    // 渲染首页
    List<User> findAllUsers();
}
