package com.think.core.po;

import lombok.Data;

/**
 * Created by qiudong on 2018/1/2.
 */
@Data
public class UserPo {


    private Integer userid;
    private String userName;
    private String password;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
