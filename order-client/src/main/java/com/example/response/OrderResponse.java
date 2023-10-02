package com.example.response;

import com.example.entity.Order;

public class OrderResponse {
	private int id;
	private String orderName;
	private String orderType;
	
	public OrderResponse(Order order) {
		this.id = order.getId();
		this.orderName = order.getOrderName();
		this.orderType = order.getOrderType();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
}
