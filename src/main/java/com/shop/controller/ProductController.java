package com.shop.controller;

import java.util.List;
import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	@Qualifier("bibi")
	private ProductService service;
	
	@GetMapping
	public List<Product> getProductsBType(@RequestParam("type") String type){
		return service.getProductsByType(ProductType.valueOf(type));
	}

}
