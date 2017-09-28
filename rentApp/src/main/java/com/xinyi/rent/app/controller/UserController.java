package com.xinyi.rent.app.controller;

import com.xinyi.rent.app.service.UserService;
import com.xinyi.rent.model.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wxy on 2017/9/27.
 *
 * 用户注册，登录，完善信息，修改信息
 */

@RestController
@RequestMapping(value = "/api/user")
@Api(value = "用户api",description = "")
public class UserController {


    @Autowired
    public UserService userService;

    @ApiOperation(value = "用户注册", response = ApiResult.class,produces = "application/json")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ApiResult testPost(@RequestParam String userName, @RequestParam String password){

        UserModel userModel=userService.register(userName,password);
        return new ApiResult(userModel);
    }
}
