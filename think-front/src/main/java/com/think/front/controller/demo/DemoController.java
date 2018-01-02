package com.think.front.controller.demo;

import com.think.front.controller.AbstractController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.think.front.domain.Person;
/**
 * Created by qiudong on 2017/12/20.
 */
@RestController
public class DemoController extends AbstractController{



    @RequestMapping("/greeting1")
    public ResponseEntity greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.print("进入controller");
//        List<String> list = new ArrayList();
//        list.add("11111");
//        list.add("22222");
//        list.add("33333");
//        list.add("44444");
//        list.add("5555555");
//
//        list.forEach(item->{
//            System.out.println(item);
//        });
//

        Person person = new Person();
        person.setName("张三");
        //
//        list1.add("1111");
//        list1.add("2222");
//        list1.add("3333");
//
//        List list2 =new ArrayList();
//        list2.add("333113");
//        list2.add("4444");
//        list2.add("5555");
//
//        //并集
//        //list1.addAll(list2);
//        //交集
//        boolean flag = list1.retainAll(list2);
//        System.out.println(flag);
        //差集
        List<String> list = new ArrayList<String>();
        list.add("2222");
        list.add("111");

//        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//        Map map  = new HashMap<String, Object>();
//        map.put("a","11");
//        map.put("b","22");
//        map.put("c","33");
//        map.put("d","44");
//        list.add(map);
        return  wrapper((p) -> new DemoController().check(p),list);
    }


    public <T> List<T> check(List<T> list){
        return list;
    }


}
