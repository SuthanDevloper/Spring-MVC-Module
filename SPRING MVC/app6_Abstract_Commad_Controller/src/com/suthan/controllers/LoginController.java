package com.suthan.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.suthan.command.User;

public class LoginController extends AbstractCommandController {

	public LoginController() {
		setCommandClass(User.class);
		setCommandName("user");
	}
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse respone, Object command, BindException exeception)
			throws Exception {
		ModelAndView mav=null;
		
		User user = (User)command;
		String uname = user.getUname();
		String upwd = user.getUpwd();
		
		
		
		if(uname.equalsIgnoreCase("suthan")&&upwd.equals("suthan")) {
			mav = new ModelAndView("status","message","User Login Success");
		}else
		{
			mav = new ModelAndView("status","message","User Login Failure");
		}
		
		return mav;
	}

}
