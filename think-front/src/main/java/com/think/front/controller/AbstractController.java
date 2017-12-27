package com.think.front.controller;

import org.springframework.http.ResponseEntity;

import java.util.function.Function;

/**
 * Created by qiudong on 2017/12/20.
 */

public class AbstractController {

    /**
     * 获取用户Token
     */
    private String getToken(){

        return "";
    }

    public <T, R> ResponseEntity wrapper(Function<T, R> function, T params){
        R r = function.apply(params);
        Object val = r;
        return ResponseEntity.ok(val);
    }
}
