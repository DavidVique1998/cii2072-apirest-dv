package com.vique.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vique.backend.models.dao.ICategory;
import com.vique.backend.models.entities.Category;
import com.vique.backend.services.interfaces.ICategoryService;

@Service
public class CategoryService implements ICategoryService{
	@Autowired
	private ICategory dao;
	
	
	@Override
	public void save(Category c) {
	dao.save(c);
		
	}

	@Override
	public Category findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Category c=this.findById(id);
		dao.delete(c);
		
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>)dao.findAll();
	}
}
