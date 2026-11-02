package com.Studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.StudentRepositery.StudentService;
import com.controller.Student;
@RestController
@RequestMapping("/student")
public class StudentController {
	
//	@GetMapping("/test")
//	public String test()
//	{
//		return "sucesffully";
//	}

	private final StudentService studentservice;

	
	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}

    @PostMapping
	public Student addStudent(@RequestBody Student student)
	{
	
		return studentservice.addStudent(student);
	}
	
    @GetMapping
	public List<Student> getAllStudents()
	{
		return studentservice.getAllStudents();
	}
     @GetMapping("/{studentid}")
	public Student getStudentByid(@PathVariable Long studentid)
	{
		return studentservice.getStudentById(studentid);
	}
    
     @PutMapping("/{studentid}")
     public Student Update(
    		 @PathVariable Long studentid,@RequestBody Student student)
     {
    	 return studentservice.Update(studentid, student);
     }
     
	@DeleteMapping("/{studentid}")
	public String delete(@PathVariable Long studentid)
	{
		studentservice.Delete(studentid);
		return "Delete Id Successfully";
	}
	
}
