package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.User;
import com.example.demo.service.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/user")
	public List<User> listEmpleados() {
		return userService.listUsers();
	}
	
	@GetMapping("/user/{id}")
	public User userFindById(@PathVariable(name = "id") Long id) {
		return userService.userById(id);
	}

}
