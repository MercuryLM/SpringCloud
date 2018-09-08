package com.school.model;

import java.util.Date;

public class payment {
	
	private Integer pay_id;    //账单ID
	
	private Integer server_id;      //服务账号
	
	private Integer bill_id;         //业务账号
	
	private Date pay_date;           //月份
	
	private  Double payment_cost;      //费用
	
	private Integer cost_id;           //资费号
	
	private String bill_time;         //业务时长

	public Integer getPay_id() {
		return pay_id;
	}

	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}

	public Integer getServer_id() {
		return server_id;
	}

	public void setServer_id(Integer server_id) {
		this.server_id = server_id;
	}

	public Integer getBill_id() {
		return bill_id;
	}

	public void setBill_id(Integer bill_id) {
		this.bill_id = bill_id;
	}

	public Date getPay_date() {
		return pay_date;
	}

	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}

	public Double getPayment_cost() {
		return payment_cost;
	}

	public void setPayment_cost(Double payment_cost) {
		this.payment_cost = payment_cost;
	}

	public Integer getCost_id() {
		return cost_id;
	}

	public void setCost_id(Integer cost_id) {
		this.cost_id = cost_id;
	}

	public String getBill_time() {
		return bill_time;
	}

	public void setBill_time(String bill_time) {
		this.bill_time = bill_time;
	}

}
