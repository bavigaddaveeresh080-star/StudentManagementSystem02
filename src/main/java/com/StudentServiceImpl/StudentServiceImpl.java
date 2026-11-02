package com.StudentServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Repositery.StudentRepositery;
import com.StudentRepositery.StudentService;
import com.controller.Student;

@Service
public class StudentServiceImpl implements StudentService  
{
     @Autowired
	private StudentRepositery studentRepositery;
     
     
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepositery.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepositery.findAll();
	}

	@Override
	public Student getStudentById(Long studentid) {
		// TODO Auto-generated method stub
		return studentRepositery.findById(studentid).orElse(null);
	}

	@Override
	public Student Update(Long studentid, Student student) {
		// TODO Auto-generated method stub
		Student std=studentRepositery.findById(studentid).orElse(null);
		
		if(std!=null)
		{
			std.setFirstname(student.getFirstname());
			std.setLastname(student.getLastname());
			std.setEmail(student.getEmail());
			std.setMobileNumber(student.getMobileNumber());
			std.setGender(student.getGender());
			std.setAge(student.getAge());
			std.setCourse(student.getCourse());
			std.setAddress(student.getAddress());
			std.setFee(student.getFee());
			
			
			return studentRepositery.save(std);
			
		}
		return null;
		
		
	}

	@Override
	public void Delete(Long studentid) {
		studentRepositery.deleteById(studentid);
		
	}
    
	 
}
