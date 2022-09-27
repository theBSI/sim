package com.example.sim.controller;

import com.example.sim.Enum.ResultEnum;
import com.example.sim.entity.Result;
import com.example.sim.entity.Team;
import com.example.sim.service.GroupService;
import com.example.sim.utils.ResultUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@ResponseBody

/**
 *  @param request
 *  @return
 */


public class GroupController {

    @Autowired
    private GroupService groupService;

    // admin controller
    // 创建组 最多6人一组

    @PostMapping(value = "/createGroup", produces = "application/json;charset=UTF-8")

    public Result createGroup(@RequestBody Team team){
        //TODO
        team.setTeam(0010); // 生成team UID
        return ResultUtil.success(ResultEnum.SUCCESS, groupService.insert(team));
    }

    // admin controller
    // 获取组的信息

    @GetMapping(value = "/checkGroup", produces = "application/string;charset=UTF-8")
    public Result checkGroup(@RequestBody Team team){
        return ResultUtil.success(ResultEnum.SUCCESS, groupService.selectGroup(team.getTeam()));
    }

    // 创建组 和 creategroup 的区别在于一个人不能再两个组内

    @PostMapping(value = "/joinGroup", produces = "application/string;charset=UTF-8")

    public Result joinGroup(@RequestBody Team team){
        return ResultUtil.success(ResultEnum.SUCCESS, 1);
    }


}
