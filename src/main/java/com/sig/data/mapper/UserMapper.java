package com.sig.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.model.User;



public interface UserMapper {
	List<User> getAllUser();
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
}
