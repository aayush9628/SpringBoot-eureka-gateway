package com.example.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.response.ProductResponse;

@FeignClient(value = "PRODUCT-CLIENT", path = "/product")
public interface ProductFeignClient {
	
	@GetMapping("/readProduct/{id}")
	public ProductResponse read(@PathVariable int id);
}
