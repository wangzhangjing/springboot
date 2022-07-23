package com.wzj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzj.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
//    @Select("select * from tbl_book")
//    Book save();
//
//    @Select("select * from tbl_book where id=#{id}")
//    Book selectById(Integer id);
}
