package com.school.model;

public class role {
	
	private Integer role_id;          //角色ID
	
	private String role_name;         //角色名
	
	private String role_privilege;     //角色权限

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_privilege() {
		return role_privilege;
	}

	public void setRole_privilege(String role_privilege) {
		this.role_privilege = role_privilege;
	}

}
