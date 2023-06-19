package com.crud_demo_9AM_project.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud_demo_9AM_project.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
