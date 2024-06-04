package br.com.carlos.unittests.mapper.mocks;


import java.util.ArrayList;
import java.util.List;

import br.com.carlos.data.vo.v1.ProductVO;
import br.com.carlos.model.Product;
public class MockProduct {
	public Product mockEntity() {
        return mockEntity(0);
    }
    
    public ProductVO mockVO() {
        return mockVO(0);
    }
    
    public List<Product> mockEntityList() {
        List<Product> persons = new ArrayList<Product>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public List<ProductVO> mockVOList() {
        List<ProductVO> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockVO(i));
        }
        return persons;
    }
    
    public Product mockEntity(Integer number) {
    	Product product = new Product();
    	product.setPrice(number.intValue());
    	product.setId(number.intValue());
    	product.setName("Name Test" + number);
        return product;
    }

    public ProductVO mockVO(Integer number) {
    	ProductVO product = new ProductVO();
    	product.setPrice(number.intValue());
    	product.setId(number.intValue());
    	product.setName("Name Test" + number);
        return product;
    }

}
