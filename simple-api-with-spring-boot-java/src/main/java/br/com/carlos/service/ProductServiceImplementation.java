package br.com.carlos.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.carlos.model.Product;

@Service
public  class ProductServiceImplementation implements ProductService {

	public ProductServiceImplementation() {
		listaProdutos.add(new Product(1, "Poco X6 PRO", 2200));
		listaProdutos.add(new Product(2, "Red Magic 9", 5700));
		listaProdutos.add(new Product(3, "Samsung 23", 4499));
	}

	List<Product> listaProdutos = new ArrayList<Product>();
	
	public List<Product> getProducts() {
		return listaProdutos;
	}

	public Product getProduct(Integer id) {
		Iterator<Product> iterator = listaProdutos.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (product.getId().equals(id)) {
				return product;
			}
		}
		return null;
	}
	
	public Map<String, Object> createProduct(Integer id, String name, Integer price) {
		listaProdutos.add(new Product( id,  name,  price));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "Produto adicionado com sucesso");
		return map;
		
	}
	
	
	public Product updateProduct(Product produtoUsuario) {
		for(int i = 0; i< listaProdutos.size(); i++) {
			if(listaProdutos.get(i).getId() == produtoUsuario.getId()) {
				listaProdutos.get(i).setName(produtoUsuario.getName());
				listaProdutos.get(i).setPrice(produtoUsuario.getPrice());
			}
		}
		return produtoUsuario;
	}
	
	public void deleteProduct(Integer idProduto) {
		for(int i = 0; i < listaProdutos.size()-1; i++) {
			if(listaProdutos.get(i).getId() == idProduto) {
				listaProdutos.get(i).setId(null);
				listaProdutos.get(i).setName(null);
				listaProdutos.get(i).setPrice(null);
			}
		}
	}

}
