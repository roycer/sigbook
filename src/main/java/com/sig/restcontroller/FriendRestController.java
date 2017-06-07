package com.sig.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sig.model.Friend;
import com.sig.service.FriendServiceImplement;

@RestController
@RequestMapping("friend")
public class FriendRestController {
	
	@Autowired
	FriendServiceImplement friendService;

	@RequestMapping(value = "insert", method = RequestMethod.POST, consumes = "application/json")
	public void insert(@RequestBody Friend friend){
		friendService.insert(friend);
	}
	
	@RequestMapping(value = "{friend_id}/delete", method = RequestMethod.DELETE)
	public void delete(@PathVariable int friend_id){
		friendService.delete(friend_id);
	}
}
