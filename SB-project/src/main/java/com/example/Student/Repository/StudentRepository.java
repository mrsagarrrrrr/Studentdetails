package com.example.Student.Repository;

 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.Entity.Student;



@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
	
}