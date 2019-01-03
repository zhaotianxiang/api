package com.ustc.edu.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhaotianxiang
 * @Date: 2019-01-03
 * @Desprition: welcome controller
 */
@RestController
public class TestController {
    @RequestMapping(value = "/")
    public String welcome(){
        return "Welcome to my API";
    }
}
