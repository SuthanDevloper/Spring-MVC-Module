package com.suthan.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.suthan.command.User;

public class UserController extends AbstractWizardFormController {

	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException exeception) throws Exception {
		
		User user = (User)command;
		// TODO Auto-generated method stub
		return new ModelAndView("userdetails","user",user);
	}
		
	
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("welcomepage");
	}
}
