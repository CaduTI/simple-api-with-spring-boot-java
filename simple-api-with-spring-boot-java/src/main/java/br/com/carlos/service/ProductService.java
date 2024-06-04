package br.com.carlos.service;

import java.util.List;
import br.com.carlos.data.vo.v1.ProductVO;

public interface ProductService {
	List<ProductVO> getProducts();
	ProductVO getProduct(Integer id);
	ProductVO createProduct(ProductVO product);
	ProductVO updateProduct(ProductVO product);
	void deleteProduct(Integer id);
}
