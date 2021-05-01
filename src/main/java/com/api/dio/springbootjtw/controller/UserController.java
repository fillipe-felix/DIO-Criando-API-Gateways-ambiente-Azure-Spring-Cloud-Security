package com.api.dio.springbootjtw.controller;

import com.api.dio.springbootjtw.entity.UserEntity;
import com.api.dio.springbootjtw.service.UserDetailServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @Autowired
    private final UserDetailServiceImpl userDetailService;

    public List<UserEntity> findAllUsers(){
        return userDetailService.listUser();
    }
}
