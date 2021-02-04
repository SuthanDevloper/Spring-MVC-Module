package com.suthan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.XmlViewResolver;


@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(method=RequestMethod.GET)
	public String showForm() {
		return "helloform";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView wish(HttpServletRequest request,HttpServletResponse response) {
		
		String uname=request.getParameter("uname");
		return new ModelAndView("wish","uname",uname);
		
		//XmlViewResolver
	}
}
