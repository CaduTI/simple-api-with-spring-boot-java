package br.com.carlos.model;

import java.util.Iterator;

public class Product {
	private Long id;
	private String name;
	private Integer price;
	
	public Product(Long id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	private Product() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
}