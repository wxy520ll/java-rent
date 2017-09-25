package com.xinyi.rent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wxy on 2017/9/23.
 */

@SpringBootApplication
@RestController
@RequestMapping(value = "/rent")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = "/helloWorld")
    public String helloWorld(){

        return "hello  world";
    }
}
