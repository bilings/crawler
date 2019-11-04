package com.crawler.web.service;

import com.crawler.web.entity.User;

/**
 *
 *@autor LILIN
 *@create  14:53
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
