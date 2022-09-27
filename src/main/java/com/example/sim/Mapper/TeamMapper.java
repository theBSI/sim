package com.example.sim.Mapper;

import com.example.sim.entity.Team;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper

public interface TeamMapper {

    @Insert("insert into team(Team, p1, p2, p3, p4, p5, p6) values(#{Team}, #{p1}, #{p2}, #{p3}, #{p4}, #{p5}, #{p6})")
    int insert(Team team);

    @Select("select * from team where Team = #{team}")
    int selectGroup(int id);
}
