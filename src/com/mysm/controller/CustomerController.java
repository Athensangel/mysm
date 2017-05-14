package com.mysm.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mysm.model.CustomerVo;
import com.mysm.service.CustomerService;
/**
 * 客户数据操作对象
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "customer")
public class CustomerController {
	
	@Autowired
	//@Resource
	private CustomerService customerService;
	
	@RequestMapping("getCustomerIndex")
	public String getCustomerIndex(ModelMap map){
		List<CustomerVo> customerVoList = customerService.findAllCustomers();
		System.out.println(customerVoList);
		map.put("customerVoList", customerVoList);
		return "customer/customerList";
	}
	
	/**
	 * 跳转到客户新增页
	 * @return
	 */
	@RequestMapping(value="/jumpSavaCustomer",method = RequestMethod.GET)
	public ModelAndView jumpSavaCustomer(){
		ModelAndView modelAndView = new ModelAndView("customer/customerAdd");
		return modelAndView;
	}

	/**
	 * 新增客户
	 * @return
	 */
	@RequestMapping(value="/insertCoustomer",method = RequestMethod.POST)
	public ModelAndView insertCoustomer(CustomerVo customerVo){
		customerVo.setCid(getUUID());
		ModelAndView andView = new ModelAndView();
		andView.setView(new RedirectView("getCustomerIndex"));
		customerService.addCustomers(customerVo);
		return andView;
	}
	 
	/**
	 * 跳转到部门修改页
	 * @return
	 */
	@RequestMapping("jumpUpdateCustomer")
	public ModelAndView jumpUpdateCustomer(String cid){
		ModelAndView view = new ModelAndView();
		view.setViewName("customer/customerUp");
		CustomerVo customerVo = customerService.modifiAllCustomers(cid);
		view.addObject("customerVo", customerVo);
		return view;
	}
	
	/**
	 * 部门修改页
	 * @return
	 */
   @RequestMapping(value="/updateCustomers", method = RequestMethod.POST)  
	public String updateCustomers(CustomerVo CustomerVo){
	   customerService.updateCustomers(CustomerVo);
		return "redirect:getCustomerIndex";
	}
	
	/**
	 * 删除部门
	 * @return
	 */
	
	@RequestMapping(value="delCustomers",method=RequestMethod.GET)
	public ModelAndView delCustomers(@RequestParam String cid){
		customerService.deleteCustomers(cid);
		return new ModelAndView("redirect:getCustomerIndex");
	}
	
	/**
	 * 获得一个UUID 
	 * @return
	 */
	public String getUUID() {
		  String s = UUID.randomUUID().toString(); 
	      //去掉“-”符号 
	      return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
	}
}
