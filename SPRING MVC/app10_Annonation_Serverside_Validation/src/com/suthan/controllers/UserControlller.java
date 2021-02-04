package com.suthan.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.suthan.command.User;

@Controller
@RequestMapping("/reg")
public class UserControlller {
	
	@RequestMapping(method=RequestMethod.GET)
	public String showForm(Model model) {
		model.addAttribute("user",new User());
			return "reg_form";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView registration(@Valid User user,BindingResult errors,Model model) {
		if(errors.hasErrors()) {
			return new ModelAndView("reg_form","user",user);
		} else {
			return new ModelAndView("registrationdetails","user",user);
		}
		
	}
	
}
