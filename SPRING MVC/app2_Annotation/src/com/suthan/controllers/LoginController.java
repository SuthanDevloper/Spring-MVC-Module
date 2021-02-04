package com.suthan.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@org.springframework.stereotype.Controller
public class LoginController implements Controller {
	
	@RequestMapping("/login")
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		ModelAndView mav = null;
		
		if(uname.equalsIgnoreCase("Suthan")&&upwd.equals("suthan123")) {
			mav = new ModelAndView("success");
		}else
		{
			mav = new ModelAndView("failure");
		}
		
		return mav;
	}

}
