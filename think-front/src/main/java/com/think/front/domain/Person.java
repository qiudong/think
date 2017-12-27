package com.think.front.domain;

import java.math.BigDecimal;

/**
 * Created by qiudong on 2017/12/26.
 */
public class Person<T> {
    private String name;
    private Integer age;

    private BigDecimal idCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getIdCard() {
        return idCard;
    }

    public void setIdCard(BigDecimal idCard) {
        this.idCard = idCard;
    }
}
