package com.example.sim.Mapper;


import com.example.sim.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper

public interface UserMapper {
    @Select("select * from personalinfo where id = #{id}")
    User queryById(int id);

    @Select("select password from personalinfo where username = #{username}")
    User queryByUserName(String username);

    @Insert("insert into personalinfo(username, password, email, id) values(#{username}, #{password}, #{email}, #{id})")
    int insert(User user);

    @Select("select username from personalinfo where username= #{username}")
    String UserExist(String username);

    @Delete("DELETE from personalinfo WHERE id = #{id}")
    int delUser(int id);


}
