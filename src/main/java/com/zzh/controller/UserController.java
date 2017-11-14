package com.zzh.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: zhuzhenghuan
 * Date: 2017/11/14
 * Time: 下午6:45
 * Description:
 */
@Component
@RequestMapping("/test")
public class UserController {


    public UserController(){
        System.out.println("===============");
    }

    @RequestMapping(value = "/pingpong.do", method = RequestMethod.GET)
    @ResponseBody
    public String pingpong(){


        return "pingpong";
    }


}