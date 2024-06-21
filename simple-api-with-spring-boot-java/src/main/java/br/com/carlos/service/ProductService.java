package br.com.carlos.service;

import java.util.List;
import br.com.carlos.data.vo.v1.ProductVO;
import br.com.carlos.data.vo.v2.ProductVOV2;

public interface ProductService {
	List<ProductVO> getProducts();
	ProductVO getProduct(Integer id);
	ProductVO createProduct(ProductVO product);
	ProductVOV2 createProductV2(ProductVOV2 product);
	ProductVO updateProduct(ProductVO product);
	void deleteProduct(Integer id);
}
