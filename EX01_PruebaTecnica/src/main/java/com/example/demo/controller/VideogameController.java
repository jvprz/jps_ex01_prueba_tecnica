package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Videogame;
import com.example.demo.service.IVideogameService;

@RestController
@RequestMapping("/api")
public class VideogameController {
	
	@Autowired
	IVideogameService videojuegoService;
	
	@GetMapping("/game/{id}")
	public Videogame videogameFindById(@PathVariable(name="id") Long id) {
		return videojuegoService.videogameById(id);
	}

}
