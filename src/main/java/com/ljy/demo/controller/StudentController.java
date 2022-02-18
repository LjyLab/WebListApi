package com.ljy.demo.controller;

import com.ljy.demo.domain.Student;
import com.ljy.demo.domain.StudentExample;
import com.ljy.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author admin
 * @Create 2022-02-17 14:24
 * @Desc
 * @Application
 **/
@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/selectByExample",method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> selectByExample(StudentExample studentExample){
        List<Student> students = studentService.selectByExample(studentExample);
        System.out.println(students);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "success");
        map.put("count", 4);
        map.put("data", students);
        return map;
    }

}
