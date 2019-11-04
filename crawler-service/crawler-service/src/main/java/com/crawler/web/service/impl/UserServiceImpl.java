package com.crawler.web.service.impl;

import com.crawler.web.entity.User;
import com.crawler.web.mapper.UserMapper;
import com.crawler.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 *@autor LILIN
 *@create  14:53
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        userDao.selectByPrimaryKey(1);
        return userDao.getUserById(1);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
