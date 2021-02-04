package com.suthan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping;

public class WishController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String uname= request.getParameter("uname");
		return new ModelAndView("wish","uname",uname);
	}

	//ControllerClassNameHandlerMapping
}
