package com.entity;

public class Storage {
	private Integer id;
	private String name;
	private Integer number;
	private Float price;
	private String type;
	
	public Storage() {
	}
	public Storage(Integer id, String name, Integer number, Float price, String type) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.price = price;
		this.type = type;
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
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
