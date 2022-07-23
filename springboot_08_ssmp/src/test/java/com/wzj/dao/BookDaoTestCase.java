package com.wzj.dao;

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
public class BookDaoTestCase {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test1(){
        System.out.println(bookMapper.selectByMap(null));
//        System.out.println(bookMapper.selectById(2));
    }
    @Test
    public void test2(){
//        System.out.println(bookMapper.save());
        Book book=new Book();
        book.setType("测试数据111");
        book.setName("测试数据111");
        book.setDescription("测试数据111");
        bookMapper.insert(book);
    }
    @Test
    public void test3(){
        int i = bookMapper.deleteById(6);
        System.out.println(i);
    }
    @Test
    public void test4(){
        List<Book> books = bookMapper.selectList(null);
        books.forEach(System.out::println);
    }
    @Test
    public void test5(){
        IPage page=new Page(2,3);
        IPage iPage = bookMapper.selectPage(page, null);
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getPages());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());

    }
    @Test
    public void test6(){
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("type" ,"我");
        bookMapper.selectList(qw);
    }
    @Test
    public void test7(){
        LambdaQueryWrapper<Book> lm=new LambdaQueryWrapper<>();
        lm.like(Book::getType,"我");
        bookMapper.selectList(lm);
    }
}
