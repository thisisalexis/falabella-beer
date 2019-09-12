package cl.falabella.beer.api.model;

import java.math.BigDecimal;

public class Beer implements ApiResponse {
	
	private String name;
	private String description;
	private BigDecimal unitPrice;
	private String brand; // TODO This must to be changed to a Brand Object
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
