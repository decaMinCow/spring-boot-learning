package com.demo.springboot.mybaits.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.demo.springboot.mybaits.po.UserInfo;

@Mapper
public interface UserMapper {
	
//	@Select("SELECT id, user_name AS userName, user_age AS userAge FROM user WHERE id=#{id}")
	@Select("SELECT * FROM user WHERE id=#{id}")
	UserInfo findOne(int id);
	
//	@Select(value="SELECT id, user_name AS userName, user_age AS userAge FROM user")
	@Select(value="SELECT * FROM user")
	List<UserInfo> findAll();

}
