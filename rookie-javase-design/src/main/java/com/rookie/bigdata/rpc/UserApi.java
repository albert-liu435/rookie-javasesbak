package com.rookie.bigdata.rpc;

import com.rookie.bigdata.rpc.service.User;

/**
 * @Classname UserApi
 * @Description TODO
 * @Author rookie
 * @Date 2021/10/11 14:49
 * @Version 1.0
 */
public interface UserApi {

    User selectById(Integer id);
}
