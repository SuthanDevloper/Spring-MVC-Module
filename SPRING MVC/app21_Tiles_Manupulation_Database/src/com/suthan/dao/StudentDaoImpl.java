package com.suthan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.suthan.entity.StudentEntity;

@Repository("studentDao")
public class StudentDaoImpl implements Studentdao {
	
	
	@Autowired
	private  HibernateTemplate hibernateTemplate; 
	
	String status= "";
	@Override
	public String add(StudentEntity studentEntity) {
		
			
		try {
			StudentEntity std = (StudentEntity)hibernateTemplate.get(StudentEntity.class, studentEntity.getSid());
			
			if(std == null) {
				String pk_val = (String) hibernateTemplate.save(studentEntity);
				if(pk_val.equals(studentEntity.getSid())) {
					status= "Student Insert suceessfully";
				}else {
					status="Student Insert failure";
				}
			}else {
				status="student existed alreay";
			}
		}catch (Exception e) {
			status="Student Insert failure";
			e.printStackTrace();
		}
				return status;
	}

	@Override
	public StudentEntity searchStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
