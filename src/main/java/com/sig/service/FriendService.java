package com.sig.service;

import com.sig.model.Friend;

public interface FriendService {
	public void insert(Friend friend);
	
	public void delete(int friend_id);
}
