package com.hr.mapper;

import com.hr.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName：UserMapper
 * @Description：TODO
 * @Author：HuangZhen
 * @Date 2020/11/10 17:26
 * @Versopn：1.0
 */

@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<User> findAll();

    @Delete("delete from user where id = #{id}")
    public int deleteById(int id);


    @Select("select * from user where id= #{id}")
    public User findById(int id);

    /**
     * 根据id删除
     * @param u
     * @return 受影响行数
     */
    @Update("update user set mobile =#{mobile} , password = #{password}, sex =#{sex} ," +
            " birthdate=#{birthdate} , address=#{address} , email=#{email} , state=#{state} " +
            ",   update_time=curtime() " +
            "where id = #{id}")
    public int update(User u);

    @Insert( "INSERT into user(mobile,password,sex,birthdate,address,email,state,create_time)" +
            "VALUES(#{mobile},#{password},#{sex},#{birthdate},#{address},#{email},#{state},CURTIME())")
    public int insert(User u);

}
