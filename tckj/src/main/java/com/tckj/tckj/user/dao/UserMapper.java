package com.tckj.tckj.user.dao;

import com.tckj.tckj.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

	@Select("SELECT * FROM user WHERE name = #{name}")
	public User findUserByName(String name);

	@Select("SELECT * FROM user WHERE id = #{id}")
	public User findUserById(Integer id);

}
