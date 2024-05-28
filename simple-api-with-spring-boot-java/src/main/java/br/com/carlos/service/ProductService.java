package br.com.carlos.service;

import java.util.List;
import java.util.Map;

import br.com.carlos.model.Product;

public interface ProductService {
	List<Product> getProducts();
	Product getProduct(Integer id);
	Map<String, Object> createProduct(Integer id, String name, Integer price);
	Product updateProduct(Product product);
	void deleteProduct(Integer id);
}
