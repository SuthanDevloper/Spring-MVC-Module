package com.suthan.contollers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;

@Controller
@RequestMapping("/wish")
public class WishController {

	//DefaultAnnotationHandlerMapping
	@RequestMapping(method=RequestMethod.GET)
	public String getForm() {
		return "helloform"; 
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView wish(HttpServletRequest request,HttpServletResponse response) {
		
		String uname=request.getParameter("uname");
		return new ModelAndView("wish","uname",uname);
		
	}
}
