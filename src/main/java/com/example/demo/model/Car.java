package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int car_code;
	
	private String make;
	private String model;
	private Long year;
	private Long price;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "cutomer_number")
    
    private Customer cutomer;
	

	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "sale_person_id")
    
    private Salesperson salesperson;


	public int getCar_code() {
		return car_code;
	}


	public void setCar_code(int car_code) {
		this.car_code = car_code;
	}


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


	public Customer getCutomer() {
		return cutomer;
	}


	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}


	public Salesperson getSalesperson() {
		return salesperson;
	}


	public void setSalesperson(Salesperson salesperson) {
		this.salesperson = salesperson;
	}
	
	
	
	
	
	

}
