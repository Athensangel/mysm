package com.mysm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mysm.mapper.CustomerMapper;
import com.mysm.model.CustomerVo;
import com.mysm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Resource
	private CustomerMapper customerMapper;

	@Override
	public List<CustomerVo> findAllCustomers() {
		return customerMapper.queryAllCustomers();
	}

	@Override
	public void addCustomers(CustomerVo customerVo) {
		customerMapper.insertCustomers(customerVo);
	}

	@Override
	public void updateCustomers(CustomerVo customerVo) {
		customerMapper.updateCustomers(customerVo);
	}

	@Override
	public void deleteCustomers(String cid) {
		customerMapper.delCustomers(cid);
	}

	@Override
	public CustomerVo modifiAllCustomers(String cid) {
		return customerMapper.modifiAllCustomers(cid);
	}

}
