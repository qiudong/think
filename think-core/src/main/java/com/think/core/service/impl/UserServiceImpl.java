package com.think.core.service.impl;

import com.think.core.mapper.UserMapper;
import com.think.core.po.UserPo;
import com.think.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by qiudong on 2018/1/2.
 */
@Service
public class UserServiceImpl implements UserService,Serializable {

    @Autowired
   private UserMapper userMapper;

    @Override
    public UserPo getUser(Integer userid) {
        return null;
    }
}
