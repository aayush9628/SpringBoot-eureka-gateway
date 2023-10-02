package com.example.service;

import com.example.response.CustomerResponse;

public interface ICustomerService {
	CustomerResponse read(int id);
}
