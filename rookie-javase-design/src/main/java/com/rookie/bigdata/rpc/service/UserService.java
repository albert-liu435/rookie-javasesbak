package com.rookie.bigdata.rpc.service;

import com.rookie.bigdata.rpc.UserApi;

/**
 * @Classname UserService
 * @Description TODO
 * @Author rookie
 * @Date 2021/10/11 14:50
 * @Version 1.0
 */
public class UserService implements UserApi {

    @Override
    public User selectById(Integer id) {
        User user=new User();
        user.setUsername("张三");
        user.setId(id);
        user.setMessage("张三是胖子");
        System.out.println("UserService调用了selectById()方法查询用户.....");
        return user;
    }
}
