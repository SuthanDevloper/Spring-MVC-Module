package com.suthan.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suthan.command.Student;
import com.suthan.dao.Studentdao;
import com.suthan.entity.StudentEntity;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private Studentdao studentDao;
	
	@Transactional
	@Override
	public String addStudent(Student student) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setSid(student.getSid());
		studentEntity.setSname(student.getSname());
		studentEntity.setSaddr(student.getSaddr());
		
		String status = studentDao.add(studentEntity);
		
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		
		return null;
	}

	@Override
	public String deleteStudent(String sid) {
		
		return null;
	}

}
