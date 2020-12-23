package com.vique.backend.services.interfaces;

import java.util.List;

import com.vique.backend.models.entities.Student;

public interface IStudentService {
	public void save(Student student); //create-update
	public Student findById(Long id); //retrieve
	public void delete(Long id);	//delete
	public List<Student> findAll(); //list
}
