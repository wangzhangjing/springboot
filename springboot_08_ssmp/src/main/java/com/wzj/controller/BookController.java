package com.wzj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wzj.controller.utils.R;
import com.wzj.domain.Book;
import com.wzj.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public R getAll(){
        return new R(true,iBookService.list());
    }
    @PostMapping
    public R save(@RequestBody Book book) throws IOException {

      if (book.getName().equals("123")) throw new IOException();
        boolean flag = iBookService.save(book);

      return new R(flag,flag?"添加成功^_^" : "添加失败-_-");
    }
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(iBookService.modify(book));
    }
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(iBookService.delete(id));
    }
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        new R(true,iBookService.getById(id));
        return new R(true,iBookService.getById(id));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable  int pageSize,Book book){

//        System.out.println("参数="+book);
        IPage<Book> page = iBookService.getPage(currentPage, pageSize,book);
        //如果当前页码值大于总页码数那么重新执行程序操作，使用最大页码当作当前页码值
        if (currentPage > page.getPages()){
            page=iBookService.getPage((int) page.getPages(),pageSize,book);
        }
        return new R(true,page);
    }
//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable  int pageSize){
//        IPage<Book> page = iBookService.getPage(currentPage, pageSize);
//        //如果当前页码值大于总页码数那么重新执行程序操作，使用最大页码当作当前页码值
//        if (currentPage > page.getPages()){
//            page=iBookService.getPage((int) page.getPages(),pageSize);
//        }
//        return new R(true,page);
//    }

}
