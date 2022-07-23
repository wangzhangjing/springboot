package com.wzj.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/books")
public class BookController  {
    //创建记录日志的对象
//    private static final Logger log= LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById(){
        System.out.println("jsdnqlwe");

        //调试日志
        log.debug("debug..");
        //消息日志
        log.info("info..");
        //警告信息
        log.warn("warn..");
        //错误日志
        log.error("error..");



        return "djewoqjd";
    }
}
