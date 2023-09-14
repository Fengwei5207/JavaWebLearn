package com.example.javeweblearn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.example.javeweblearn.pojo.Status;
import com.example.javeweblearn.pojo.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
@CrossOrigin
@RestController
public class RequestController {

    //    传统方式
//    public String simpleParam(HttpServletRequest request) {
//
//
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + ":" + age);
//        return "OK";
//    SpringBoot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(String name, Integer age) {
        System.out.println(name + ":" + age);

        return "ok";
    }


    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);

        return "ok";
    }

    @PostMapping("/status")
    public String simpleStatus(@RequestBody String status){
        System.out.println("RawStatus:"+status);
//      JSON对象转java对象使用fastjson

        Status NowStatus = new Status();
//        StatusObject NowStatus;
        String jsonObject = status;
        NowStatus = JSON.parseObject(jsonObject,Status.class);

        System.out.println("NowStatus:"+NowStatus.getStatus());


//        Boolean NowStatus = Boolean.valueOf(status.substring(0,status.length()-1));
//        System.out.println(NowStatus);
//        System.out.println(NowStatus.getClass());

        return "ok";
    }


}
