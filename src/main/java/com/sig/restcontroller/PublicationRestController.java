package com.sig.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sig.model.Publication;
import com.sig.service.PublicationService;

@RestController
@RequestMapping("publication")
public class PublicationRestController {

	@Autowired
	private PublicationService pubblicationService;
	
	@RequestMapping(value = "{user_id}/getMyFriendsPublications", method = RequestMethod.GET, produces = "application/json")
	public List<Publication> getMyFriendsPublications(@PathVariable int user_id){
		return pubblicationService.selectMyFriendsPublications(user_id);
	}
	
	@RequestMapping(value = "{user_id}/getMyPublications", method = RequestMethod.GET, produces = "application/json")
	public List<Publication> getMyPublications(@PathVariable int user_id){
		return pubblicationService.selectMyPublications(user_id);
	}
	
	@RequestMapping(value = "{user_id}/insert", method = RequestMethod.POST, consumes = "application/json")
	public void insert(@PathVariable int user_id, @RequestBody Publication publication){
		publication.setUser_id(user_id);		
		pubblicationService.insert(publication);
	}
}
