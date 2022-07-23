package com.wzj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzj.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService iBookService;

    @Test
    void testById(){
        iBookService.getById(2);
    }
    @Test
    public void test2(){
//        System.out.println(bookMapper.save());
        Book book=new Book();
        book.setType("测试数据111");
        book.setName("测试数据111");
        book.setDescription("测试数据111");
        iBookService.save(book);
    }
    @Test
    public void update(){
        Book book=new Book();
        book.setId(7);
        book.setName("我四十多万");
        book.setType("啊啊啊啊娃娃");
        book.setDescription("猜测欧米茄去哪玩");
        iBookService.updateById(book);
    }
    @Test
    public void test3(){
        Boolean i = iBookService.removeById(6);
        System.out.println(i);
    }
    @Test
    public void test4(){
        List<Book> books = iBookService.list();
        books.forEach(System.out::println);
    }
    @Test
    public void test5(){
        IPage<Book> Page =new Page<Book>(2, 3);
        IPage iPage = iBookService.page(Page);
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getPages());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());

    }

}
