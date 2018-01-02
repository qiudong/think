package com.think.core.mapper;

import com.think.core.po.UserPo;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by qiudong on 2018/1/2.
 */
public interface UserMapper{

    UserPo getuser(Integer userid);
}
