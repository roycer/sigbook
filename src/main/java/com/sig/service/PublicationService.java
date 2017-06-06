package com.sig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sig.data.mapper.PublicationMapper;
import com.sig.model.Publication;

@Service
public class PublicationService implements PublicationMapper{
	@Autowired
	private PublicationMapper publicationMapper; 

	@Override
	public List<Publication> selectMyFriendsPublications(int user_id) {
		// TODO Auto-generated method stub
		return publicationMapper.selectMyFriendsPublications(user_id);
	}
	
	@Override
	public List<Publication> selectMyPublications(int user_id) {
		// TODO Auto-generated method stub
		return publicationMapper.selectMyPublications(user_id);
	}

	@Override
	public void insert(Publication publication) {
		// TODO Auto-generated method stub
		publicationMapper.insert(publication);
	}
	
	
	
}
