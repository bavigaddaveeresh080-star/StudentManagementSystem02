package com.StudentRepositery;

import java.util.List;

import com.StudentMain;
import com.controller.Student;

public interface StudentService {

	
	Student  addStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudentById(Long studentid);
	
	
	Student Update(Long studentid,Student student);
	
	void Delete(Long studentid);
	
	
	
	
	
}
