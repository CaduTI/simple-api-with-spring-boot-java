package br.com.carlos.unittests.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import br.com.carlos.data.vo.v1.ProductVO;
import br.com.carlos.mapper.DozerMapper;
import br.com.carlos.model.Product;
import br.com.carlos.unittests.mapper.mocks.MockProduct;


public class DozerConverterTest {
	MockProduct inputObject;

    @BeforeEach
    public void setUp() {
        inputObject = new MockProduct();
    }

    @Test
    public void parseEntityToVOTest() {
    	ProductVO output = DozerMapper.parseObject(inputObject.mockEntity(), ProductVO.class);
    	assertEquals(Integer.valueOf(0), output.getId());
        assertEquals("Name Test0", output.getName());
        assertEquals(Integer.valueOf(0), output.getPrice());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<ProductVO> outputList = DozerMapper.parseListObjects(inputObject.mockEntityList(), ProductVO.class);
        ProductVO outputZero = outputList.get(0);
        
        assertEquals(Integer.valueOf(0), outputZero.getId());
        assertEquals("Name Test0", outputZero.getName());
        assertEquals(Integer.valueOf(0), outputZero.getPrice());
        
        ProductVO outputSeven = outputList.get(7);
        
        assertEquals(Integer.valueOf(0), outputSeven.getId());
        assertEquals("Name Test0", outputSeven.getName());
        assertEquals(Integer.valueOf(0), outputSeven.getPrice());
        
        ProductVO outputTwelve = outputList.get(12);
        
        assertEquals(Integer.valueOf(0), outputTwelve.getId());
        assertEquals("Name Test0", outputTwelve.getName());
        assertEquals(Integer.valueOf(0), outputTwelve.getPrice());
    }

    @Test
    public void parseVOToEntityTest() {
    	Product output = DozerMapper.parseObject(inputObject.mockVO(), Product.class);
    	assertEquals(Integer.valueOf(0), output.getId());
        assertEquals("Name Test0", output.getName());
        assertEquals(Integer.valueOf(0), output.getPrice());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Product> outputList = DozerMapper.parseListObjects(inputObject.mockVOList(), Product.class);
        Product outputZero = outputList.get(0);
        
        assertEquals(Integer.valueOf(1), outputZero.getId());
        assertEquals("Name Test0", outputZero.getName());
        assertEquals(Integer.valueOf(1), outputZero.getPrice());
        
        Product outputSeven = outputList.get(7);
        
        assertEquals(Integer.valueOf(7), outputSeven.getId());
        assertEquals("Name Test0", outputSeven.getName());
        assertEquals(Integer.valueOf(7), outputSeven.getPrice());
        
        Product outputTwelve = outputList.get(12);
        
        assertEquals(Integer.valueOf(12), outputTwelve.getId());
        assertEquals("Name Test0", outputTwelve.getName());
        assertEquals(Integer.valueOf(12), outputTwelve.getPrice());
    }
}
