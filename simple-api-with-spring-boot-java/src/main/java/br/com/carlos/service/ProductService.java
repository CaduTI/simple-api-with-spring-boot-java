package br.com.carlos.service;

import java.util.List;
import br.com.carlos.model.Product;

public interface ProductService {
	List<Product> getProducts();
	Product getProduct(Long id);
	void createProduct(Long id, String name, Integer price);
}
