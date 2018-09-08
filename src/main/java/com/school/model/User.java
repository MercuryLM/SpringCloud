package com.school.model;

import java.util.Date;

public class User {
	
	private Integer user_id;    //账务账号
	
	private String login_name;   //登录名
	
	private String login_password;   //登录密码
	
	private Date create_date;       //创建时间
	
	private Date pause_date;        //暂停时间
	
	private Date close_date;        //删除时间
	
	private String real_name;       //真实姓名
	
	private String idcard_no;       //身份证号
	
	private  Date birth_date;       //生日
	
	private String sex;           //性别
	
	private Integer user_telephone;     //电话号码
	
	private String user_email;        //用户邮箱
	
	private String user_occupation;    //用户职业

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getPause_date() {
		return pause_date;
	}

	public void setPause_date(Date pause_date) {
		this.pause_date = pause_date;
	}

	public Date getClose_date() {
		return close_date;
	}

	public void setClose_date(Date close_date) {
		this.close_date = close_date;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getIdcard_no() {
		return idcard_no;
	}

	public void setIdcard_no(String idcard_no) {
		this.idcard_no = idcard_no;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getUser_telephone() {
		return user_telephone;
	}

	public void setUser_telephone(Integer user_telephone) {
		this.user_telephone = user_telephone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_occupation() {
		return user_occupation;
	}

	public void setUser_occupation(String user_occupation) {
		this.user_occupation = user_occupation;
	}

}
