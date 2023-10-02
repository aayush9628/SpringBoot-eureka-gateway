package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.OrderRepository;
import com.example.response.OrderResponse;
import com.example.entity.Order;
@Service
public class OrderService implements IOrderService {

	@Autowired
	OrderRepository orderRepo;

	@Override
	public OrderResponse read(int id) {
		Order order = orderRepo.findById(id).get();
		OrderResponse response = new OrderResponse(order);
		return response;
	}

}
