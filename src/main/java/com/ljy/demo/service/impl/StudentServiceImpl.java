package com.ljy.demo.service.impl;

import com.ljy.demo.dao.StudentMapper;
import com.ljy.demo.domain.Student;
import com.ljy.demo.domain.StudentExample;
import com.ljy.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author admin
 * @Create 2022-02-17 14:20
 * @Desc
 * @Application
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> selectByExample(StudentExample example) {
        return studentMapper.selectByExample(example);
    }
}
