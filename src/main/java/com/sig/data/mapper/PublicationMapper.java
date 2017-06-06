package com.sig.data.mapper;

import java.util.List;

import com.sig.model.Publication;

public interface PublicationMapper {
	public List<Publication> selectMyFriendsPublications(int user_id);
	
	public List<Publication> selectMyPublications(int user_id);
	
	public void insert(Publication publication);
}
