package br.com.carlos.data.vo.v1;

import java.io.Serializable;
import java.util.Objects;


public class ProductVO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer price;
	
	public ProductVO(Integer id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
		}
	
	public ProductVO() {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	
}
