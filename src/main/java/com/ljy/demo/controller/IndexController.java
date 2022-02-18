package com.ljy.demo.controller;

import com.ljy.demo.domain.User;
import com.ljy.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Author admin
 * @Create 2022-02-15 16:34
 * @Desc
 * @Application
 **/
@Controller
@RequestMapping("/in")
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping(value = "/findAllUser",method = RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> findAllUsers(){
        List<User> allUsers = indexService.findAllUsers();
        HashMap<String, Object> map = new HashMap<>();
        map.put("data",allUsers);
        return map;
    }


}
