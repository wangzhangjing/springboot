package com.wzj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzj.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface BookDao extends BaseMapper<Book>{
}
