package com.vique.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.vique.backend.models.entities.Student;

public interface IStudent extends CrudRepository<Student, Long> {

}
