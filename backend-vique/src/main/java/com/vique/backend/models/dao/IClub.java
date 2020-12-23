package com.vique.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.vique.backend.models.entities.Club;

public interface IClub extends CrudRepository<Club, Long>{

}
