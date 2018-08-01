package com.wesley.growth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by Wesley on 2018/8/1.
 */
@RestController
@Slf4j
public class SimpleController {

    @RequestMapping("/login")
    public String login(){
        log.info("正在登录...");
        return "login success";
    }

    @RequestMapping("/admin")
    public String admin(){
        log.info("管理员操作...");
        return "success";
    }

}
