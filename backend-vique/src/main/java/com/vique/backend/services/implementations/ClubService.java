package com.vique.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vique.backend.models.dao.IClub;
import com.vique.backend.models.entities.Club;
import com.vique.backend.services.interfaces.IClubService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClubService implements IClubService{
	@Autowired
	private IClub dao; //Data Access Object
	
	@Override
	@Transactional(readOnly=true)
	public Club findById(Long id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Club> findAll() {		
		return (List<Club>) dao.findAll();
	}
}
