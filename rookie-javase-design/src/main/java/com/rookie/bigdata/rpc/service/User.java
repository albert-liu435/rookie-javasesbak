package com.rookie.bigdata.rpc.service;

import java.io.Serializable;

/**
 * @Classname User
 * @Description TODO
 * @Author rookie
 * @Date 2021/10/11 14:50
 * @Version 1.0
 */
public class User implements Serializable {
    private  Integer id;
    private  String username;
    private  String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
