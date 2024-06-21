package br.com.carlos.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.carlos.data.vo.v2.ProductVOV2;
import br.com.carlos.model.Product;

@Service
public class ProductMapper {
	public ProductVOV2 convertEntityToVO(Product product) {
		ProductVOV2 vo = new ProductVOV2();
		vo.setId(product.getId());
		vo.setName(product.getName());
		vo.setPrice(product.getPrice());
		vo.setReleaseDate(new Date());
		
		return vo;
	}
	
	public Product convertVOToEntity(ProductVOV2 product) {
		Product entity = new Product();
		entity.setId(product.getId());
		entity.setName(product.getName());
		entity.setPrice(product.getPrice());
		return entity;
	}
}
