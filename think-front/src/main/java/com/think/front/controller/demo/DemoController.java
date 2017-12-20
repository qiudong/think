package com.think.front.controller.demo;

import com.think.front.controller.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiudong on 2017/12/20.
 */
@RestController
public class DemoController extends AbstractController{

    @RequestMapping("/greeting1")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return name + "hello";
    }

}
