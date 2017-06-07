package com.sig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sig.data.mapper.UserMapper;
import com.sig.model.User;

@Service
public class UserServiceImplement implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}	

	@Override
	public User select(int user_id) {
		// TODO Auto-generated method stub
		return userMapper.select(user_id);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);		
	}

	@Override
	public void delete(int user_id) {
		userMapper.delete(user_id);
	}
	
	@Override
	public List<User> selectMyFriends(int user_id) {
		// TODO Auto-generated method stub
		return userMapper.selectMyFriends(user_id);
	}

	@Override
	public List<User> selectMyNoFriends(int user_id) {
		// TODO Auto-generated method stub
		return userMapper.selectMyNoFriends(user_id);
	}

}
