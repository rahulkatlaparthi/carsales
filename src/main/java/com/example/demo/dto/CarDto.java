package com.example.demo.dto;

public class CarDto {
	private String make;
	private String model;
	private Long year;
	private Long price;
	private int cutomer_number;
	private int sale_person_id;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public int getCutomer_number() {
		return cutomer_number;
	}
	public void setCutomer_number(int cutomer_number) {
		this.cutomer_number = cutomer_number;
	}
	public int getSale_person_id() {
		return sale_person_id;
	}
	public void setSale_person_id(int sale_person_id) {
		this.sale_person_id = sale_person_id;
	}
	
	
}
