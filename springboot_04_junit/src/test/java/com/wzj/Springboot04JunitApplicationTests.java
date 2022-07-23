package com.wzj;

import com.wzj.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {

    //注入测试对象
    @Autowired
    private BookDao bookDao;



    @Test
    void contextLoads() {
        System.out.println("test。。。。");
        //执行要测试的对应的方法
        bookDao.save();
    }

}
