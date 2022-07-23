package com.wzj.controller;

import com.wzj.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    //读取yaml数据的单一数据
    @Value("${country}")
    private String country1;

    //读取数组里面数据
    @Value("${user1.name}")
    private String name1;

    //读取数组里面数据
    @Value("${user2[1].age}")
    private String age1;

    @Value("${tempDir}")
    private String tempDir;

    //使用自动装配把所有对象封装到一个对象中
    @Autowired
    private Environment aaa;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("wzj");
        System.out.println("country1=====>"+country1);
        System.out.println("name=====>"+name1);
        System.out.println("age1=====>"+age1);
        System.out.println("tempDir=====>"+tempDir);
        System.out.println("...............................................");
        System.out.println(aaa.getProperty("server.port"));
        System.out.println(aaa.getProperty("user1.name"));
        System.out.println("................................................");
        System.out.println(myDataSource);
        return "王章ss";
    }

}
