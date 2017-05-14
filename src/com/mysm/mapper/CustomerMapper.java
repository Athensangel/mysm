package com.mysm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysm.model.CustomerVo;
/**
 * 客户数据接口
 * @author Administrator
 *
 */
@Repository
public interface CustomerMapper {
	List<CustomerVo> queryAllCustomers();

    public void insertCustomers(CustomerVo customerVo);//添加一条数据
	
	public void updateCustomers(CustomerVo customerVo);//更新表里的数据 
	
	public void delCustomers(String cid);//删除一条数据
	
	public CustomerVo modifiAllCustomers(String cid);//通过cId修改数据
}
