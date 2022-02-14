package com.ljy.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljy.demo.domain.User;
import com.ljy.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listAll() {
        List<User> users = userService.listAll();
        System.out.println(users);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "success");
        map.put("count", 4);
        map.put("data", users);
        return map;
    }

    /*
     * @Description: 关联职务列表显示
     * @Author: LjyLab
     * @Date: 2022/2/14 13:54
     * @Param: []
     * @Return: java.util.Map<java.lang.String,java.lang.Object>
     * @Version: 1.0
     **/
    @RequestMapping(value = "/userList" , method = RequestMethod.GET)
    @ResponseBody Map<String, Object> getUserByList(){
        List<User> userByList = userService.getUserByList();
        System.out.println(userByList);
        Map<String, Object> map = new HashMap<>();
        if (userByList.size() > 0){
            map.put("code", 0);
            map.put("msg", "success");
            map.put("data",userByList);
            return map;
        }else {
            map.put("code",4);
            map.put("msg","error");
            return map;
        }
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> add(@RequestBody User user) {
        int result = userService.insert(user);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("id") int id) {
        int result = userService.deleteById(id);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }
    
    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseBody
    private Map<String, Object> update(@RequestBody User user) {
        int result = userService.update(user);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }
}
