package com.example.response;

import com.example.entity.Customer;

public class CustomerResponse {
	private int id;
	private String custName;
	private int age;
	private ProductResponse prodResp;
	
	public CustomerResponse(Customer customer) {
		this.id = customer.getId();
		this.custName = customer.getCustName();
		this.age = customer.getAge();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ProductResponse getProdResp() {
		return prodResp;
	}

	public void setProdResp(ProductResponse prodResp) {
		this.prodResp = prodResp;
	}

}
