package com.school.model;

import java.util.Date;

public class Admin {
	
	private Integer admin_id;     //管理员ID
	
	private String admin_code;      //登录名
	
	private String admin_password;   //登录密码
	
	private String admin_name;       //管理员名字
	
	private Integer admin_telephone;     //电话号码
	
	private String admin_email;         //邮箱
	
	private Date admin_enrolldate;      //授权日期
	
	private Integer role_id;           //角色ID

	public Integer getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_code() {
		return admin_code;
	}

	public void setAdmin_code(String admin_code) {
		this.admin_code = admin_code;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public Integer getAdmin_telephone() {
		return admin_telephone;
	}

	public void setAdmin_telephone(Integer admin_telephone) {
		this.admin_telephone = admin_telephone;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public Date getAdmin_enrolldate() {
		return admin_enrolldate;
	}

	public void setAdmin_enrolldate(Date admin_enrolldate) {
		this.admin_enrolldate = admin_enrolldate;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
}
