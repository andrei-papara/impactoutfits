package com.impactoutfits.controllers;

import java.util.ArrayList;
import java.util.List;

import com.impactoutfits.models.Product;

public class ProductController implements IProductController {

	@Override
	public List<Product> list() {
		List<Product> products = new ArrayList<Product>();
		return products;
	}

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product get(Long id) {
		return new Product();
	}

}
