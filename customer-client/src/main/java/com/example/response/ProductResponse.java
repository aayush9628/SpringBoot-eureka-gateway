package com.example.response;

public class ProductResponse {
	private int id;
	private String prodName;
	private int price;
	private OrderResponse orderResp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public OrderResponse getOrderResp() {
		return orderResp;
	}

	public void setOrderResp(OrderResponse orderResp) {
		this.orderResp = orderResp;
	}

}
