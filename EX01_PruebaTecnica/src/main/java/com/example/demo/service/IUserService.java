package com.example.demo.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IUserDAO;
import com.example.demo.dto.User;

@Service
public class IUserService {
	
	@Autowired
	IUserDAO iUserDAO;
	
	public User userById(Long id) {
		return iUserDAO.findById(id).get();
	}
}
