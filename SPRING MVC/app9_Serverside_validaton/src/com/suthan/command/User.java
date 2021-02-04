package com.suthan.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User {
	
	@NotEmpty
	private String uname;
	
	@NotEmpty(message="user password is required")
	@Size(min=6, max=10, message="user password must be 6 -10 chaacter")
	private String upwd;
	
	
	@NotNull(message="user age is required")
	@Range(min=20, max=40, message="user age  range 20-40")
	private int uage;
	
	
	
	private String uemail;
	
	
	private String umobile;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}

	
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	
	
}
