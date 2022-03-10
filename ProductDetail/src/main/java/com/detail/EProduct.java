package com.detail;

import javax.persistence.*;

@Entity
@Table(name = "eproduct")

public class EProduct   {

	private long ID;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	
	
	public EProduct() {
		super();
	}
	public EProduct(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	

}