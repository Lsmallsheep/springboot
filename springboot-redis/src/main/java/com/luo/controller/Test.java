package com.luo.controller;


import com.luo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author ANGEL
 * @Date 2021/8/28 17:13
 */
@Controller
@RequestMapping("/test")
public class Test {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/go")
    @ResponseBody
    public Object test(){
        redisUtil.set("testKey","刘晓瑞是傻批");
        return redisUtil.get("testKey");
//        return "hello";
    }

    @GetMapping("/to")
    @ResponseBody
    public String te(){
        return "hello";
    }
}
