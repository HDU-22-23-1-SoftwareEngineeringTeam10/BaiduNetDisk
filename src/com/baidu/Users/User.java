package com.baidu.Users;

import java.util.*;

public class User {
    protected String username;
    protected Integer userId;
    public List<String> FileName = new ArrayList<String>();

    public Integer getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
