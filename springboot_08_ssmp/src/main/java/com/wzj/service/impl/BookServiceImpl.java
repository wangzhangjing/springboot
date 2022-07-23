package com.wzj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzj.dao.BookMapper;
import com.wzj.domain.Book;
import com.wzj.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean save(Book book) {
        return baseMapper.insert(book) >0;
    }

    @Override
    public boolean modify(Book book) {
        return baseMapper.updateById(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return baseMapper.deleteById(id) >0;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage<Book> iPage=new Page<>(currentPage,pageSize);
        baseMapper.selectPage(page(iPage),null);
        return iPage;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        LambdaQueryWrapper<Book> lqw =new LambdaQueryWrapper<Book>();
        lqw.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        lqw.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        lqw.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
        IPage<Book> iPage=new Page<>(currentPage,pageSize);
        baseMapper.selectPage(page(iPage),lqw);
        return iPage;
    }
}
