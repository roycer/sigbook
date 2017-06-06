package com.sig.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sig.model.User;
import com.sig.service.ServiceUser;

@RestController
@RequestMapping("Usuarios")
public class UserController {
	@Autowired
	private ServiceUser serviceUser;

	@RequestMapping(value = "/listausuarios", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity getAllUser() {
		return new ResponseEntity<>(serviceUser.getAllUser(), HttpStatus.OK);
	}
	// @RequestMapping(value = "get/{id_account}", method = RequestMethod.GET,
	// produces = "application/json")
	// public ResponseEntity selectOne(@PathVariable int id_account){
	// return new
	// ResponseEntity<>(accountService.selectById(id_account),HttpStatus.CREATED);
	// }

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity getUser(@PathVariable int id) {
		return null;
	}

	@RequestMapping(value = "/nuevousuario", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity insertUser(@RequestBody User user) {
		serviceUser.insertUser(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/editarusuario", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity updateUser(@RequestBody User user) {
		serviceUser.updateUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/eliminarusuario", method = RequestMethod.DELETE, consumes = "application/json")
	public ResponseEntity deleteUser(@RequestBody User user) {
		serviceUser.deleteUser(user);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
