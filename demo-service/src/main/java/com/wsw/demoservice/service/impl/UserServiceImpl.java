package com.wsw.demoservice.service.impl;

import com.wsw.demoapi.service.UserService;
import com.wsw.demobase.entity.User;
import com.wsw.demodao.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 14:06 2020/8/26
 * @Description:
 */
@Service(interfaceName = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
}
