package com.impactoutfits.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.impactoutfits.models.Product;

@RequestMapping("/api")
public interface IProductController {

	@GetMapping("/products")
	public List<Product> list();

	@PostMapping("/add-product")
	public void create(@RequestBody Product product);

	@GetMapping("/product/{id}")
	public Product get(@PathVariable("id") Long id);
	
}
