package com.vique.backend.services.interfaces;

import java.util.List;

import com.vique.backend.models.entities.Club;

public interface IClubService {
	public Club findById(Long id);
	public List<Club> findAll();	
}
