package com.think.core.service;

import com.think.core.po.User;
import org.springframework.stereotype.Service;

/**
 * Created by qiudong on 2018/1/2.
 */
@Service
public interface UserService {

    User getUser(Integer userid);
}
