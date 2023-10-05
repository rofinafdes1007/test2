package com.supplychain.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@Column
private Integer id;
	@Column
private String userName;
	@Column
private String password;
public Admin(Integer id, String userName, String password) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Admin [id=" + id + ", userName=" + userName + ", password=" + password + "]";
}



}
