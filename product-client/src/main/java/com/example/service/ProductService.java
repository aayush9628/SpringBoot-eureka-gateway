package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.feignclients.OrderFeignClient;
import com.example.repository.ProductRepository;
import com.example.response.ProductResponse;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	OrderFeignClient orderFeignClient;
	
	@Override
	public ProductResponse read(int id) {
		Product product = productRepo.findById(id).get();
		ProductResponse response = new ProductResponse(product);
		response.setOrderResp(orderFeignClient.read(product.getId()));
		return response;
	}

}
