package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cutomer_number;
	private String name;
	private String address;
	
	private Long phoneNumber;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "repayment_scheme_id")
    
    private Repaymentscheme repayment;
	
	
	public int getCutomer_number() {
		return cutomer_number;
	}
	public void setCutomer_number(int cutomer_number) {
		this.cutomer_number = cutomer_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Repaymentscheme getRepayment() {
		return repayment;
	}
	
	public void setRepayment(Repaymentscheme repayment) {
		this.repayment = repayment;
	}
	
	

	
	
	

}
