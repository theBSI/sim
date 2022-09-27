package com.example.sim.service;


import com.example.sim.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.example.sim.Mapper.UserMapper;

@Service

public class UserService implements UserMapper {
    @Lazy

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }

    @Override
    public User queryByUserName(String username) {
        return userMapper.queryByUserName(username);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public String UserExist(String username) {
        return userMapper.UserExist(username);
    }

    @Override
    public int delUser(int id) {
        return userMapper.delUser(id);
    }

    public int updateUser(User user) {
        userMapper.delUser(user.getId());
        userMapper.insert(user);
        return 1;
    }

    public String Login(String username, String password){
        if(userMapper.queryByUserName(username).getPassword().equals(password)){
            return "成功登录";
        }
        else{
            return "密码错误";
        }
    }

    public String Register(User user){
        if(userMapper.UserExist(user.getUsername()) == (null)){
            userMapper.insert(user);
            return "成功注册";
        }
        else{
            return "用户名已存在";
        }
    }
}
