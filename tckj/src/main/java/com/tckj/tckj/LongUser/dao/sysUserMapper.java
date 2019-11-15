package com.tckj.tckj.LongUser.dao;

import com.tckj.tckj.LongUser.entity.sysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface sysUserMapper {
    @Select("select * from user")
    public List<sysUser> getAllUser();
}
