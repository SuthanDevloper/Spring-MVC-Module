package com.suthan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.suthan.command.Student;
import com.suthan.service.StudentService;

@Controller
public class StudentController {
	String status="";
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String getForm() {
		
		return "welcomeDef";
	}
	
	
	// gettin addform
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView showAddForm() {
		// student - model name
		return new ModelAndView("addDef", "student", new Student());
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView add(Student student) {
	
		status = studentService.addStudent(student);
		
		//status=studentService.addStudent(student);
		return new ModelAndView("statusDef","status",status);
		
		
	}

}
