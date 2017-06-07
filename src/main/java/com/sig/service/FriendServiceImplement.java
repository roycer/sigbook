package com.sig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sig.data.mapper.FriendMapper;
import com.sig.model.Friend;

@Service
public class FriendServiceImplement implements FriendService{

	@Autowired
	FriendMapper friendMapper;
	
	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub
		friendMapper.insert(friend);
	}

	@Override
	public void delete(int friend_id) {
		// TODO Auto-generated method stub
		friendMapper.delete(friend_id);
	}

}
