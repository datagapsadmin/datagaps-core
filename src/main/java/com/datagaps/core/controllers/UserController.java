package com.datagaps.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @GetMapping
    public String getUserName(){
        return "My user name is Spring - Check this link: https://www.youtube.com/watch?v=HHyjWc0ASl8";
    }
}
