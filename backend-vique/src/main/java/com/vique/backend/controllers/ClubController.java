package com.vique.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vique.backend.models.entities.Club;
import com.vique.backend.services.interfaces.IClubService;

@RestController
@RequestMapping("/api/club")
public class ClubController {
	
	@Autowired
	private IClubService service;
		
	@GetMapping("/{id}")
	public Club retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Club> list() {
		return service.findAll();
	}
		
	
	
	

}