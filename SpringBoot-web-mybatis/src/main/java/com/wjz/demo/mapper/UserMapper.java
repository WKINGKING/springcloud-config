package com.wjz.demo.mapper;

import org.apache.ibatis.annotations.Select;

import com.wjz.demo.entities.User;

public interface UserMapper {
	
	@Select("select * from user where u_loginname = #{uLoginname} and u_password = #{uPassword}")
	public User login(User user);
	
}
