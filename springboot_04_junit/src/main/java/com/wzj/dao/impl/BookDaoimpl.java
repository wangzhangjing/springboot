package com.wzj.dao.impl;

import com.wzj.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoimpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is runing..........");
    }
}
