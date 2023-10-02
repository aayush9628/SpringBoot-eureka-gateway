package com.example.service;

import com.example.response.ProductResponse;

public interface IProductService {
	ProductResponse read(int id);
}
