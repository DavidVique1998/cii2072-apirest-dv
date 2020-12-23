package com.vique.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.vique.backend.models.entities.Category;

public interface ICategory extends CrudRepository<Category, Long>{

}
