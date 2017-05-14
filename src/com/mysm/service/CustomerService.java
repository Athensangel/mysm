package com.mysm.service;

import java.util.List;

import com.mysm.model.CustomerVo;

public interface CustomerService {
	List<CustomerVo> findAllCustomers();//查找一条数据
	
	public void addCustomers(CustomerVo customerVo);//添加一条数据
	
	public void updateCustomers(CustomerVo customerVo);//更新表里的数据 
	
	public void deleteCustomers(String cid);//删除一条数据
	
	public CustomerVo modifiAllCustomers(String cid);//通过cId修改数据
}
