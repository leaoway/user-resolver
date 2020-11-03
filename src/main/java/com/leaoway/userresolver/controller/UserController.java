package com.leaoway.userresolver.controller;

import com.leaoway.userresolver.annotation.UserBean;
import com.leaoway.userresolver.vo.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("userInfo")
    public Object getUserInfo(@UserBean UserInfo userInfo) {
        return userInfo;
    }
}
