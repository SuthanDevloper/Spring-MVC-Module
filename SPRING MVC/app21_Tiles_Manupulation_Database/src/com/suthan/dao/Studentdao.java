package com.suthan.dao;

import com.suthan.entity.StudentEntity;

public interface Studentdao {
	
	public String add(StudentEntity studentEntity);
	public StudentEntity searchStudent(String sid);
	public String delete(String sid);
	
	
	

}
