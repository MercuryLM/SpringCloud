package com.school.model;

import java.util.Date;

public class manage {
	
	private Integer manage_id;      //业务账号
	
	private Integer account_id;       //账务账号
	
	private String unix_host;        //服务器IP
	
	private String os_username;      //OS账号
	
	private String login_password;     //登录密码
	
	private Date create_date;          //创建时间
	
	private Date pause_date;           //暂停时间
	
	private Date close_date;          //删除时间
	
	private Integer cost_id;           //资费ID

	public Integer getManage_id() {
		return manage_id;
	}

	public void setManage_id(Integer manage_id) {
		this.manage_id = manage_id;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getUnix_host() {
		return unix_host;
	}

	public void setUnix_host(String unix_host) {
		this.unix_host = unix_host;
	}

	public String getOs_username() {
		return os_username;
	}

	public void setOs_username(String os_username) {
		this.os_username = os_username;
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

	public Integer getCost_id() {
		return cost_id;
	}

	public void setCost_id(Integer cost_id) {
		this.cost_id = cost_id;
	}
	

}
