package com.aLeaf.Mapper;

import com.aLeaf.Pojo.UserTable;
import com.aLeaf.Pojo.UserTableExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserTableMapper {

    @Select("SELECT * FROM user_table WHERE u_id = #{uId}")
    UserTable selectByPrimaryKey(String uId);

    @Insert("insert into `aleaf`.`user_table` (`u_name`, `u_sex`, `u_password`) values (#{u_name}, #{u_sex}, #{u_password})")
    void insertUserTable(UserTable u);

}