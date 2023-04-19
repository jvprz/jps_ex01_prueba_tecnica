package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IVideogameDAO;
import com.example.demo.dto.Videogame;

public class IVideogameService {
	
	@Autowired
	IVideogameDAO iVideogameDAO;

	public Videogame videogameById(Long id) {
		return iVideogameDAO.findById(id).get();
	}
}
