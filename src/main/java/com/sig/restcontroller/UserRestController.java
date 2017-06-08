package com.sig.restcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sig.model.User;
import com.sig.service.UserService;

@RestController
@RequestMapping("user")
public class UserRestController {
	
	@Autowired
	private UserService userService;

	@CrossOrigin(origins="*",methods=RequestMethod.GET)
	@RequestMapping(value = "/listausuarios", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity getAllUser() {
		return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}

	@CrossOrigin(origins="*",methods=RequestMethod.GET)
	@RequestMapping(value = "/{user_id}", method = RequestMethod.GET, produces = "application/json")
	public User get(@PathVariable int user_id) {
		return userService.select(user_id);
	}

	@CrossOrigin(origins="*",methods=RequestMethod.POST)
	@RequestMapping(value = "/insert", method = RequestMethod.POST, consumes = "application/json")
	public void insert(@RequestBody User user) {
		userService.insert(user);		
	}

	@CrossOrigin(origins="*",methods=RequestMethod.PUT)
	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
	public void update(@RequestBody User user) {
		userService.update(user);		
	}

	@CrossOrigin(origins="*",methods=RequestMethod.DELETE)
	@RequestMapping(value = "{user_id}/delete", method = RequestMethod.DELETE)
	public void delete(@PathVariable int user_id) {
		userService.delete(user_id);		
	}

	@CrossOrigin(origins="*",methods=RequestMethod.GET)
	@RequestMapping(value = "{user_id}/getMyFriends", method = RequestMethod.GET, produces = "application/json")
	public List<User> getMyFriends(@PathVariable int user_id) {
		return userService.selectMyFriends(user_id);
	}

	@CrossOrigin(origins="*",methods=RequestMethod.GET)
	@RequestMapping(value = "{user_id}/getMyNoFriends", method = RequestMethod.GET, produces = "application/json")
	public List<User> getMyNoFriends(@PathVariable int user_id) {
		return userService.selectMyNoFriends(user_id);
	}

	@CrossOrigin(origins="*",methods=RequestMethod.POST)
	@RequestMapping(value = "checkLogin", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public User checkLogin(@RequestBody User user) {
		return userService.checkLogin(user);
	}
}
