package com.sig.data.mapper;

import java.util.List;
import com.sig.model.User;


public interface UserMapper {
	public List<User> getAllUser();
	
	public User select(int user_id);

	public void insert(User user);

	public void update(User user);

	public void delete(int user_id);

	public List<User> selectMyFriends(int user_id);

	public List<User> selectMyNoFriends(int user_id);

	public User checkLogin(User user);
}
