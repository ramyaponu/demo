package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demoentity")
public class DemoEntity {
	@Id	
 private Integer id;
	@Column(name="name")
private String name;
 
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
public DemoEntity(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public DemoEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "DemoEntity [id=" + id + ", name=" + name + "]";
}
 
}
