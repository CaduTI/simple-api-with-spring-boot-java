package br.com.carlos.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlos.model.Product;
import br.com.carlos.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("")
	List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		return productService.getProduct(id);
	}
	
	@PostMapping(value = "")
	public Map<String,Object> createProduct(@RequestParam(value = "id") Long id,
			@RequestParam(value = "name") String name,@RequestParam(value = "price") Integer price){
		productService.createProduct(id,name,price);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "Produto adicionado com sucesso");
		return map;
		
	}
}
