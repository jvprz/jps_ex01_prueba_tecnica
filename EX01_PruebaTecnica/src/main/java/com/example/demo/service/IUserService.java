package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IUserDAO;
import com.example.demo.dto.User;

@Service
public class IUserService {
	
	@Autowired
	IUserDAO iUserDAO;
	
	public List<User> listUsers() {
		return iUserDAO.findAll();
	}
	
	public User userById(Long id) {
		return iUserDAO.findById(id).get();
	}
}
