package br.com.carlos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carlos.data.vo.v1.ProductVO;
import br.com.carlos.exceptions.ResourceNotFoundException;
import br.com.carlos.mapper.DozerMapper;
import br.com.carlos.model.Product;
import br.com.carlos.repository.ProductRepository;

@Service
public  class ProductServiceImplementation implements ProductService {
	@Autowired
	ProductRepository repository;
	
	public List<ProductVO> getProducts() {
		return DozerMapper.parseListObjects(repository.findAll(), ProductVO.class);
	}
	
	public ProductVO getProduct(Integer id) {
		var entity = repository.findById(id)
				.orElseThrow((() -> new ResourceNotFoundException("No records found for this ID!")));
		return DozerMapper.parseObject(entity, ProductVO.class);
	}
	public ProductVO createProduct(ProductVO produto) {
		
		var entity = DozerMapper.parseObject(produto, Product.class);
		System.out.println(produto);
		System.out.println(entity);
		var vo = DozerMapper.parseObject(repository.save(entity), ProductVO.class);
		return vo;
	}
	
	public ProductVO updateProduct(ProductVO produto) {
		
		var entity = repository.findById(produto.getId())
				.orElseThrow((() -> new ResourceNotFoundException("No records found for this ID!")));
		
		entity.setName(produto.getName());
		entity.setPrice(produto.getPrice());
		var vo = DozerMapper.parseObject(repository.save(entity), ProductVO.class);
		return vo;
	}
	
	public void deleteProduct(Integer idProduto) {
		var entitySearch = repository.findById(idProduto)
				.orElseThrow((() -> new ResourceNotFoundException("No records found for this ID!")));
		
		repository.delete(entitySearch);
	}
}
