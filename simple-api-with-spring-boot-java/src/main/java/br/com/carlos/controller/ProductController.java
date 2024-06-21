package br.com.carlos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.carlos.data.vo.v1.ProductVO;
import br.com.carlos.data.vo.v2.ProductVOV2;
import br.com.carlos.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("")
	List<ProductVO> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/{id}")
	public ProductVO getProduct(@PathVariable("id") Integer id) {
		return productService.getProduct(id);
	}
	
	@PostMapping(
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductVO createProduct(@RequestBody ProductVO product){
		return productService.createProduct(product);
		
	}
	

	@PostMapping(value = "/v2",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductVOV2 createProductV2(@RequestBody ProductVOV2 product){
		return productService.createProductV2(product);
		
	}
	
	@PutMapping(value = "/{id}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductVO updateProduct(@RequestBody ProductVO product){
		return productService.updateProduct(product);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}
}
