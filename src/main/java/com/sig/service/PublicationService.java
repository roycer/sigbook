package com.sig.service;

import java.util.List;

import com.sig.model.Publication;

public interface PublicationService {
	public List<Publication> selectMyFriendsPublications(int user_id);
	
	public List<Publication> selectMyPublications(int user_id);
	
	public void insert(Publication publication);
}
