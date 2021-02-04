package com.suthan.controller;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LocalTime time = LocalTime.now();
		int hour =time.getHour();
		String wish_message="";
		if (hour <12 ) {
			 wish_message="Good morning";
	} else if( hour <17 && hour >= 12 )  {
			wish_message="Good EVENING";
	} else{
			wish_message="GOOD NIGHT";
	}
		return new ModelAndView("wish","message",wish_message);
	}

}
