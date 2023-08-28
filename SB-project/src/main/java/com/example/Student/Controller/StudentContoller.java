package com.example.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.Student;
import com.example.Student.Service.StudentService;

@RestController
public class StudentContoller 
{
	 @Autowired
	 private StudentService services;
	 
	 @GetMapping("/student")
	 public Iterable<Student>getStudents() 
	 {
		 return services.listAll();     
	 }

	 @PostMapping(value = "/student")
	 private long saveBook(@RequestBody Student students)   
	 {  
		 services.saveOrUpdate(students);  
		 return  students.getId();  
	 }
	   
	
	 @RequestMapping("/student/{id}")  
	 private Student getBooks(@PathVariable(name = "id") int studentid)   
	 {  
	 return services.getStudentById(studentid);  
	 }  
	 
	    
	 @PutMapping("/student/{id}")

	    private Student update(@RequestBody Student students)   
	    {  
		   services.saveOrUpdate(students);  
	       return students;  
	    }  

	 @DeleteMapping("/student/{id}")  
	 private void deleteStudent(@PathVariable("id") int id)   
	 {  
		 services.delete(id);  
	 }  
	
	  
	 
}