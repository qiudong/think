package com.think.core.mapper;

import com.think.core.po.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by qiudong on 2018/1/2.
 */
@Mapper
@Component(value="UserMapper")
public interface UserMapper{

    User getuser(Integer userid);
}
