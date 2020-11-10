package com.hr.service;

import com.hr.entity.User;

import java.util.List;

/**
 * @ClassName：UserService
 * @Description：TODO
 * @Author：HuangZhen
 * @Date 2020/11/10 17:31
 * @Versopn：1.0
 */
public interface UserService {

    public List<User> findAll();

    public int deleteById(int id);

    public User findById(int id);

    public int insert(User user);

    public int update(User user);

}
