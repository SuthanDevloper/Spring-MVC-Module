package com.suthan.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ProcessingTimeInterceptors implements HandlerInterceptor {

	
	@Override // before controller 
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		long start_time=System.currentTimeMillis();
		request.setAttribute("start_time", start_time);
		return true;
	}
	
	
	@Override // after controller 
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelandview)
			throws Exception {
		long end_time=System.currentTimeMillis();
		long start_time=(Long)request.getAttribute("start_time");
		long process_time=end_time - start_time;
		
		modelandview.addObject("start_time",start_time);
		modelandview.addObject("end_time",end_time);
		modelandview.addObject("process_time",process_time);
		
		
	}
	
	@Override // after submit the response
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception execption)
			throws Exception {
		System.out.println("====aftercomp");

	}

	

	

}
