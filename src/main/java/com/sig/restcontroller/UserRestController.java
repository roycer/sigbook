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

import com.sig.model.User;
import com.sig.service.UserService;

@RestController
@RequestMapping("user")
public class UserRestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/listausuarios", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity getAllUser() {
		return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{user_id}", method = RequestMethod.GET, produces = "application/json")
	public User get(@PathVariable int user_id) {
		return userService.select(user_id);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST, consumes = "application/json")
	public void insert(@RequestBody User user) {
		userService.insert(user);		
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
	public void update(@RequestBody User user) {
		userService.update(user);		
	}

	@RequestMapping(value = "{user_id}/delete", method = RequestMethod.DELETE)
	public void delete(@PathVariable int user_id) {
		userService.delete(user_id);		
	}

	@RequestMapping(value = "{user_id}/getMyFriends", method = RequestMethod.GET, produces = "application/json")
	public List<User> getMyFriends(@PathVariable int user_id) {
		return userService.selectMyFriends(user_id);
	}

	@RequestMapping(value = "{user_id}/getMyNoFriends", method = RequestMethod.GET, produces = "application/json")
	public List<User> getMyNoFriends(@PathVariable int user_id) {
		return userService.selectMyNoFriends(user_id);
	}

	@RequestMapping(value = "checkLogin", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public User checkLogin(@RequestBody User user) {
		return userService.checkLogin(user);
	}
}
