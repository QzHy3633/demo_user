package com.hr.service.serviceimpl;

import com.hr.entity.User;
import com.hr.mapper.UserMapper;
import com.hr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName：UserServiceImpl
 * @Description：TODO
 * @Author：HuangZhen
 * @Date 2020/11/10 17:32
 * @Versopn：1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }
}
