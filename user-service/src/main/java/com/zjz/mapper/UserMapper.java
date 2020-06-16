package com.zjz.mapper;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

import com.zjz.entity.User;
public interface UserMapper extends Mapper<User> {
	List<User> selectUser(User user);
}
