package com.sig.service;

import java.util.List;

import com.sig.model.User;

public interface ServiceUser {
		List<User> getAllUser();
		User insertUser(User user);
		User updateUser(User user);
		void deleteUser(User user);
}
