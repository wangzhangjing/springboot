package com.wzj.ccoomm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wzj")
public class wzj {

    @GetMapping
    public String as(){
        System.out.println("running.......");
        return "running.......";
    }
}
