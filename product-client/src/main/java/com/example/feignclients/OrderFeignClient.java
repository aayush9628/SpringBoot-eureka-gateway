package com.example.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.response.OrderResponse;

@FeignClient(value = "ORDER-CLIENT", path = "/order")
public interface OrderFeignClient {
	
	@GetMapping("/read/{id}")
	public OrderResponse read(@PathVariable int id);
}
