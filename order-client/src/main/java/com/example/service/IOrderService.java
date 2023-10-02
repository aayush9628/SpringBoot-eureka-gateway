package com.example.service;

import com.example.response.OrderResponse;

public interface IOrderService {
	OrderResponse read(int id);
}
