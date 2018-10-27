package com.datagaps.core.models;

import io.swagger.annotations.ApiModelProperty;

public class UserModel {
    @ApiModelProperty(notes = "Provides system generated user id")
    private int userId;
    @ApiModelProperty(notes = "Provides User Name")
    private String userName;

    public UserModel(int id, String name){
        this.userId = id;
        this.userName = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
