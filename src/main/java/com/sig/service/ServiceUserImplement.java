package com.sig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sig.data.mapper.UserMapper;
import com.sig.model.User;

@Service
public class ServiceUserImplement implements ServiceUser {
	@Autowired
	private UserMapper userMapper;

	public List<User> getAllUser() {
		List<User> ListaUser = userMapper.getAllUser();
		return ListaUser;
	}

	@Override
	public User insertUser(User user) {
		userMapper.insertUser(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userMapper.updateUser(user);
		return user;
	}

	@Override
	public void deleteUser(User user) {
		userMapper.deleteUser(user);
	}
}
