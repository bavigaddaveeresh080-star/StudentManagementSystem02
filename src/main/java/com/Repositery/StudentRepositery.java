package com.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentMain;
import com.controller.Student;


public interface StudentRepositery extends  JpaRepository<Student, Long>
{

	
}
