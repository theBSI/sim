package com.example.sim.service;

import com.example.sim.Mapper.TeamMapper;
import com.example.sim.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class GroupService implements TeamMapper{

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public int insert(Team team) {
        return teamMapper.insert(team);
    }

    @Override
    public int selectGroup(int id) {
        return teamMapper.selectGroup(id);
    }
}
