package com.datagaps.core.controllers;

import com.datagaps.core.models.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@Api(value = "User details controller", description = "User controller provides crud operations")
public class UserController {
    @ApiOperation(value = "get user name")
    @ApiResponses(value = {
            @ApiResponse(code = 100, message = "Some message"),
            @ApiResponse(code = 200, message = "Successful message")
    })
    @GetMapping
    public String getUserName(){
        return "My user name is Spring - Check this link: https://www.youtube.com/watch?v=HHyjWc0ASl8";
    }

    @ApiOperation(value = "get user name")
    @PostMapping("/post")
    public UserModel getUser(@RequestBody final int userId){
        return new UserModel(userId, "UserName:" + userId);
    }
}
