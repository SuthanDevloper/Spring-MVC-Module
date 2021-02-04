package com.suthan.service;

import com.suthan.command.Student;

public interface StudentService {

	public String addStudent(Student student);
	public Student searchStudent(String sid);
	public String deleteStudent(String sid);
	
	//public Student deleteStudent(Student student);
}
