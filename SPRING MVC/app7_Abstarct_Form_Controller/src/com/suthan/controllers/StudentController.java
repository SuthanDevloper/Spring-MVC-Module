package com.suthan.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractFormController;

import com.suthan.command.Student;

public class StudentController extends AbstractFormController {

	@Override
	protected ModelAndView processFormSubmission(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException exception) throws Exception {
		Student student=(Student)command;
		ModelAndView mav = new ModelAndView("registrationdetails","student",student);
		return mav;
	}

	@Override
	protected ModelAndView showForm(HttpServletRequest arg0, HttpServletResponse arg1, BindException arg2)
			throws Exception {
		
		return new ModelAndView("resgistrationform");
	}

	
}
