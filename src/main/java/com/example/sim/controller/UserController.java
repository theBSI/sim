package com.example.sim.controller;

import com.example.sim.Enum.ResultEnum;
import com.example.sim.entity.User;
import com.example.sim.service.UserService;
import com.example.sim.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.sim.entity.Result;

@Api
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // admin controller
    // 按照id获取用户的所有登录信息

    @GetMapping("/getUserInfo/{id}")

    public Result getUserByName(@PathVariable int id) {
        return ResultUtil.success(ResultEnum.SUCCESS, userService.queryById(id));
    }

    // admin controller
    // 添加一个用户

    @PostMapping("/addUser")

    public Result addUser(@RequestBody User user) {
        return ResultUtil.success(ResultEnum.SUCCESS, userService.insert(user));
    }

    @PostMapping("/delUser/{id}")

    public Result delUser(@PathVariable int id){
        return ResultUtil.success(ResultEnum.SUCCESS, userService.delUser(id));
    }

    @PostMapping("/updateUser")

    public Result updateUser(@RequestBody User user){
        return ResultUtil.success(ResultEnum.SUCCESS, userService.updateUser(user));
    }

    // 登录控制器

    @PostMapping("/login")

    public Result Login(String username, String password){
        return ResultUtil.success(ResultEnum.SUCCESS, userService.Login(username, password));
    }

    // 注册控制器 和 adduser 的区别在于不能出现重复的用户名
    @PostMapping ("/register")
    public Result register(@RequestBody User user){
        return ResultUtil.success(ResultEnum.SUCCESS, userService.Register(user));
    }
}
