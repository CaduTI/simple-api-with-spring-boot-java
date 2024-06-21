package br.com.carlos.data.vo.v2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class ProductVOV2 implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer price;
	private Date releaseDate;
	
	public ProductVOV2(Integer id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
		}
	
	public ProductVOV2() {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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
		return Objects.hash(id, name, price, releaseDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVOV2 other = (ProductVOV2) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(releaseDate, other.releaseDate);
	}
		
	
}
