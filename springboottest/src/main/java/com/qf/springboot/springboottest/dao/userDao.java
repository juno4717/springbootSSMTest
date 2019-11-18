package com.qf.springboot.springboottest.dao;

import com.qf.springboot.springboottest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface userDao {
    List<User> getList();
}
