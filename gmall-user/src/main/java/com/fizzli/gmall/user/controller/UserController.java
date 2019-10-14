package com.fizzli.gmall.user.controller;

import com.fizzli.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Hello World";
    }
}
