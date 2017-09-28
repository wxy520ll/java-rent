package com.xinyi.rent.app.service;

import com.xinyi.rent.model.UserModel;
import com.xinyi.rent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by wxy on 2017/9/27.
 */
@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public UserModel register(String phone,String password){
        UserModel userModel=new UserModel();
        userModel.setPhoneNumber(phone);
        userModel.setPassword(password);
        userModel.setToken(UUID.randomUUID().toString());
        return userRepository.save(userModel);
    }
}
