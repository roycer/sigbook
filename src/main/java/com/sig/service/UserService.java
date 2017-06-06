package com.sig.service;

import java.util.List;

import com.sig.model.User;

public interface UserService {
	List<User> getAllUser();

	User insertUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	public List<User> selectMyFriends(int user_id);

	public List<User> selectMyNoFriends(int user_id);
}
