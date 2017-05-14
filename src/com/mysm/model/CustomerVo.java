package com.mysm.model;
/**
 * 客户对象
 * @author Administrator
 *
 */
public class CustomerVo {
	private String cid;
	private String name;
	private String gender;
	private String phone;
	private String email;
	private String orders;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrders() {
		return orders;
	}
	public void setOrders(String orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "CustomerVo [cid=" + cid + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", email="
				+ email + ", orders=" + orders + "]";
	}

}
