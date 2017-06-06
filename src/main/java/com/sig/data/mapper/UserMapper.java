package com.sig.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.model.User;

<<<<<<< HEAD
public interface UserMapper {
	List<User> getAllUser();

	void insertUser(User user);

	void updateUser(User user);

	void deleteUser(User user);

	public List<User> selectMyFriends(int user_id);

	public List<User> selectMyNoFriends(int user_id);
=======


public interface UserMapper {
	List<User> getAllUser();
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
>>>>>>> branch 'master' of https://github.com/roycer/sigbook.git
}
