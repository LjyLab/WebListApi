package com.ljy.demo.service;

import com.ljy.demo.domain.User;

import java.util.List;

/**
 * @Author admin
 * @Create 2022-02-15 16:32
 * @Desc
 * @Application
 **/
public interface IndexService {
    List<User> findAllUsers();
}
