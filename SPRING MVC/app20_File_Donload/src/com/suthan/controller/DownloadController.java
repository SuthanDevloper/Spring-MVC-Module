package com.suthan.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller("/download")
public class DownloadController {

	
	@RequestMapping(value="/download", method=RequestMethod.GET)
	public String showUploadForm() {
		return "downloadform";
	}
	
	@RequestMapping(value="/download", method=RequestMethod.POST)
	public void downloadfile(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		response.setContentType("APPLICATION/OCTET-STREAM");
		File file= new File("C:\\Bala\\panda.png");
		
		FileInputStream fis = new FileInputStream(file);
		String filename=file.getName();
		
		response.setHeader("Content-Disposition","attachment;filename=\""+filename+"\"");
		
		OutputStream os = response.getOutputStream();
		
		int val = fis.read();
		while( val  !=-1) {
			os.write(val);
			val =fis.read();
		}
		
		fis.close();
		os.close();
	
	}
	
		
}
