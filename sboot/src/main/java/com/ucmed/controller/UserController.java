package com.ucmed.controller;

import com.ucmed.models.User;
import com.ucmed.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZY-LJ-1446 on 2018/3/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
    /**测试spring mybatis事务管理*/
    @ResponseBody
    @RequestMapping(value = "testRollback", produces = {"application/json;charset=UTF-8"})
    public Object testRollback(){

        userService.testRollback();
        return "";
    }
}
