package com.school.model;

import java.util.Date;

public class cost {
	
	private Integer cost_id;      //资费ID
	
	private String cost_name;         //资费名
	
	private Double base_time;         //基本时长
	
	private Double base_cost;         //基本费用
	
	private Double unit_cost;         //单位费用
	
	private String status;            //状态
	
	private Date creatime;            //创建时间
	
	private Date startime;            //开通时间
	
	private String cost_type;         //资费类型

	public Integer getCost_id() {
		return cost_id;
	}

	public void setCost_id(Integer cost_id) {
		this.cost_id = cost_id;
	}

	public String getCost_name() {
		return cost_name;
	}

	public void setCost_name(String cost_name) {
		this.cost_name = cost_name;
	}

	public Double getBase_time() {
		return base_time;
	}

	public void setBase_time(Double base_time) {
		this.base_time = base_time;
	}

	public Double getBase_cost() {
		return base_cost;
	}

	public void setBase_cost(Double base_cost) {
		this.base_cost = base_cost;
	}

	public Double getUnit_cost() {
		return unit_cost;
	}

	public void setUnit_cost(Double unit_cost) {
		this.unit_cost = unit_cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatime() {
		return creatime;
	}

	public void setCreatime(Date creatime) {
		this.creatime = creatime;
	}

	public Date getStartime() {
		return startime;
	}

	public void setStartime(Date startime) {
		this.startime = startime;
	}

	public String getCost_type() {
		return cost_type;
	}

	public void setCost_type(String cost_type) {
		this.cost_type = cost_type;
	}
	

}
