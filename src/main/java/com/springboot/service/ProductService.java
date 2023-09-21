package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.ProductDao;
import com.springboot.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao prouductDao;

	public Product saveProduct(Product product) {
		return prouductDao.save(product);

	}

	public List<Product> saveProducts(List<Product> products) {
		return prouductDao.saveAll(products);
	}

	public List<Product> getProducts() {
		return prouductDao.findAll();
	}

	public Product getProductById(int id) throws Throwable {
		// return prouductDao.findById(id).orElseThrow(() -> new
		// ResourceNotFoundException("Product", "id", id));
		return prouductDao.findById(id).orElseThrow(null);
	}

	public String deleteProductById(int id) {
		prouductDao.deleteById(id);
		return "Product Deleted !! " + id;
	}

	public Product updateProduct(Product product) throws Throwable { // Product existingProduct =
		Product existingProduct = prouductDao.findById(product.getId()).orElseThrow(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return prouductDao.save(existingProduct);

	}

}