package com.school.dao;

import java.util.List;

import com.school.model.cost;

public interface ICostDao {
	
	List<cost> findAll();           //资费查询功能
	
	void save(cost c);              //增加资费功能
	
	cost findById(int id);
	
	void update(cost c);           //修改资费
	
	void startCost(int id);          //启用资费
	
	void deleteCost(int id);         //删除资费
	
	List<cost> findByPage(int page,int size);        //分页查询
	
	int findRows();                       //查询数据的总行数

}
