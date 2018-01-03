package com.think.core.mapper;

import com.think.core.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by qiudong on 2018/1/2.
 */
@Mapper
public interface UserMapper{

    User getuser(Integer userid);
}
