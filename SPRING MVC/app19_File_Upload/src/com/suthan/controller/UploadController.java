package com.suthan.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/upload")
public class UploadController {
	
	//CommonsMultipartResolver
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String showUploadForm() {
		return "uploadform";
	}
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public ModelAndView uploadfile(@RequestParam MultipartFile[] files) {
		 String status ="" ;
		 try {
			 for(MultipartFile file: files) {
			 String file_name= file.getOriginalFilename();
			 byte[] file_content=file.getBytes();
			 FileOutputStream fos = new FileOutputStream("C:/Bala/"+file_name);
			 fos.write(file_content);
			 }
			 status="success";
		 }catch (Exception e) {
			 status = "Failure";
			e.printStackTrace();
		}
		 return new ModelAndView("status","status",status );
	}
	
}
