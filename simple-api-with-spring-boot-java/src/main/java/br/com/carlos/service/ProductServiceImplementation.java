package br.com.carlos.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlos.model.Product;

@Service
public class ProductServiceImplementation implements ProductService {

	public ProductServiceImplementation() {
		product.add(new Product(1l, "Poco X6 PRO", 2200));
		product.add(new Product(2l, "Red Magic 9", 5700));
		product.add(new Product(3l, "Samsung 23", 4499));
	}

	List<Product> product = new ArrayList<Product>();

	public List<Product> getProducts() {
		return product;
	}

	public Product getProduct(Long id) {
		Iterator<Product> iterator = product.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (product.getId().equals(id)) {
				return product;
			}
		}
		return null;
	}

	@Override
	public void createProduct(Long id, String name, Integer price) {
		product.add(new Product( id,  name,  price));
		
	}
}
