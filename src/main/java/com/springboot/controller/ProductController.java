package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Product;
import com.springboot.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/saveProducts")
	public Product addProduct(@RequestBody Product product) {
		System.out.println("in addProduct restAPI");
		return productService.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> saveProducts(@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getProducts();
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) throws Throwable {
		return productService.getProductById(id);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) throws Throwable {
		return productService.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProductById(id);
	}

}
