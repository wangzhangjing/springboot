package com.wzj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzj.dao.BookMapper;
import com.wzj.domain.Book;
import com.wzj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl2 implements BookService {

    @Autowired
    private BookMapper bookMapper;


    @Override
    public Boolean save(Book book) {
        return bookMapper.insert(book) >0;
    }

    @Override
    public Boolean update(Book book) {
        return bookMapper.updateById(book) >0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookMapper.deleteById(id) >0;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        return bookMapper.selectPage(page,null);
    }
}
