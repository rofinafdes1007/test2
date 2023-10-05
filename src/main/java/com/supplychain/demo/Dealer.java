
  package com.supplychain.demo;
  

import jakarta.persistence.Column; import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import
  jakarta.persistence.Table;
  
  @Entity
  
  
  public class Dealer {
	 
	  @Id
	  @GeneratedValue(strategy=GenerationType.SEQUENCE)
	  private Integer id;
  
  @Column(name="orgName" ,length=20)
  private String organizationName;
  
  @Column(name="contPer",length=20)
  private String contactPerson;
  
  @Column(name="contNum",length=15)
  private String contactNum;
  
  @Column(length=25) 
  private String email;
  
  @Column(name="warAdd",length=25)
  private String warehouseAdd;
  
  @Column(name="regAdd",length=20)
  private String registeredAdd;
  
  public Dealer()
  { super(); }
  
  

public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}



public String getOrganizationName() {
	return organizationName;
}

public void setOrganizationName(String organizationName) {
	this.organizationName = organizationName;
}

public String getContactPerson() {
	return contactPerson;
}

public void setContactPerson(String contactPerson) {
	this.contactPerson = contactPerson;
}


public String getContactNum() {
	return contactNum;
}



public void setContactNum(String contactNum) {
	this.contactNum = contactNum;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getWarehouseAdd() {
	return warehouseAdd;
}

public void setWarehouseAdd(String warehouseAdd) {
	this.warehouseAdd = warehouseAdd;
}

public String getRegisteredAdd() {
	return registeredAdd;
}

public void setRegisteredAdd(String registeredAdd) {
	this.registeredAdd = registeredAdd;
}



@Override
public String toString() {
	return "Dealer [id=" + id + ", organizationName=" + organizationName + ", contactPerson=" + contactPerson
			+ ", contactNum=" + contactNum + ", email=" + email + ", warehouseAdd=" + warehouseAdd + ", registeredAdd="
			+ registeredAdd + "]";
}


  
  
  }
 