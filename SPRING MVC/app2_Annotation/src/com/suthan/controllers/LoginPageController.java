package com.suthan.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@org.springframework.stereotype.Controller
public class LoginPageController {
	
	@RequestMapping("/loginpage")
	
	public ModelAndView loginpage() {
		ModelAndView mvc = new ModelAndView("loginform");
		
		return mvc;
	}

}
