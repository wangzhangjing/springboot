package com.wzj.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzj.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    void testById(){
      bookService.getById(2);
    }
    @Test
    public void test2(){
//        System.out.println(bookMapper.save());
        Book book=new Book();
        book.setType("测试数据111");
        book.setName("测试数据111");
        book.setDescription("测试数据111");
        bookService.save(book);
    }
    @Test
    public void update(){
        Book book=new Book();
        book.setId(7);
        book.setName("我四十多万");
        book.setType("啊啊啊啊娃娃");
        book.setDescription("猜测欧米茄去哪玩");
        bookService.update(book);
    }
    @Test
    public void test3(){
        Boolean i = bookService.delete(6);
        System.out.println(i);
    }
    @Test
    public void test4(){
        List<Book> books = bookService.getAll();
        books.forEach(System.out::println);
    }
    @Test
    public void test5(){
        IPage iPage = bookService.getPage(2, 3);
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getPages());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());

    }

}
