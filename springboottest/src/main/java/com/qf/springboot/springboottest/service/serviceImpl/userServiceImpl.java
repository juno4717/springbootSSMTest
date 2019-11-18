package com.qf.springboot.springboottest.service.serviceImpl;

import com.qf.springboot.springboottest.dao.userDao;
import com.qf.springboot.springboottest.entity.User;
import com.qf.springboot.springboottest.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServiceImpl implements userService {
    @Autowired
    private userDao userDao;
    @Override
    public List<User> getList() {
        return userDao.getList();
    }
}
