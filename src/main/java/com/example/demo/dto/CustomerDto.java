package com.example.demo.dto;

public class CustomerDto {
	
	
	private String name;
	private String address;
	private Long phoneNumber;
	private Long repayment_scheme_id;
	
	
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
	public Long getRepayment_scheme_id() {
		return repayment_scheme_id;
	}
	public void setRepayment_scheme_id(Long repayment_scheme_id) {
		this.repayment_scheme_id = repayment_scheme_id;
	}
	
	
	

}
