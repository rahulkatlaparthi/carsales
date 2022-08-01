package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="salesperson")
public class Salesperson {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sale_person_id;
    
    
    
	private Long phone_no;
	
	private String email_address;

	public int getSale_person_id() {
		return sale_person_id;
	}

	public void setSale_person_id(int sale_person_id) {
		this.sale_person_id = sale_person_id;
	}

	

	public Long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	
	
	
}
