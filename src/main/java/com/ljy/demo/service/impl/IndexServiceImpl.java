package com.ljy.demo.service.impl;

import com.ljy.demo.dao.IndexMapper;
import com.ljy.demo.domain.User;
import com.ljy.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author admin
 * @Create 2022-02-15 16:32
 * @Desc
 * @Application
 **/
public class IndexServiceImpl implements IndexService {
    @Autowired
    IndexMapper indexMapper;

    @Override
    public List<User> findAllUsers() {
        return indexMapper.findAllUsers();
    }
}
