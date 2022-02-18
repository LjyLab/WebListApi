package com.ljy.demo.service;

import com.ljy.demo.domain.Student;
import com.ljy.demo.domain.StudentExample;

import java.util.List;

public interface StudentService {
    List<Student> selectByExample(StudentExample example);
}
