package com.sig.data.mapper;

import com.sig.model.Friend;

public interface FriendMapper {
	public void insert(Friend friend);
	
	public void delete(int friend_id);
}
