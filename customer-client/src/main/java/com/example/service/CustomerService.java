package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.feignclients.ProductFeignClient;
import com.example.repository.CustomerRepository;
import com.example.response.CustomerResponse;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	ProductFeignClient productFeignClient;

	@Override
	public CustomerResponse read(int id) {
		Customer customer = customerRepo.findById(id).get();
		CustomerResponse response = new CustomerResponse(customer);
		response.setProdResp(productFeignClient.read(customer.getProdId()));
		return response;
	}

}
