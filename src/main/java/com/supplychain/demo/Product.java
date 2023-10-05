package com.supplychain.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy =GenerationType.SEQUENCE)
private Integer id;
@Column(length=20)
private String prodName;
@Column(length=20)
private Integer Quantity;
@Column(length=120)
private String deliveryAddress;

public Product() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public Integer getQuantity() {
	return Quantity;
}
public void setQuantity(Integer quantity) {
	Quantity = quantity;
}
public String getDeliveryAddress() {
	return deliveryAddress;
}
public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
}
@Override
public String toString() {
	return "Product [id=" + id + ", prodName=" + prodName + ", Quantity=" + Quantity + ", deliveryAddress="
			+ deliveryAddress + "]";
}



}
