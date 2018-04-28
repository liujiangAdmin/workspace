package com.ucmed.controller;


import com.ucmed.utils.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZY-LJ-1446 on 2018/3/26.
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisDao redisDao;
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getList() {
        redisDao.setCacheObject("name","liujiang");
        redisDao.setCacheObject("job","I");
        Map<String,Object> map = new HashMap<>();
        map.put("name",redisDao.getCacheObject("name"));
        map.put("job",redisDao.getCacheObject("job"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",redisDao.getCacheObject("name"));
        jsonObject.put("job",redisDao.getCacheObject("job"));
        return jsonObject;
    }


    @RequestMapping(value = "/getList1",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getList1() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",redisDao.getCacheObject("name"));
        jsonObject.put("job",redisDao.getCacheObject("job"));
        return jsonObject;
    }

    @RequestMapping(value = "/getfreemarker",method = RequestMethod.GET)
    public String aaa()
    {
        return "aaa";
    }
}
