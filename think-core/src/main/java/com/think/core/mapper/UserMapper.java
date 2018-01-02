package com.think.core.mapper;

import com.think.core.po.UserPo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by qiudong on 2018/1/2.
 */
public interface UserMapper {

    UserPo getuser(@Param("userid") String userid);
}
