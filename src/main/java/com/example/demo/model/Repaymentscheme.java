package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="repayment_scheme")
public class Repaymentscheme {
	
	@Id
	private Long repayment_scheme_id;
	
	private String name;
	private  int number_of_years;
	
   
	private Date  loan_date;
	
	private Date repayment_date;
	
	
    
	
	
	public Date getLoan_date() {
		return loan_date;
	}
	public void setLoan_date(Date date) {
		this.loan_date = date;
	}
	public Date getRepayment_date() {
		return repayment_date;
	}
	public void setRepayment_date(Date repayment_date) {
		this.repayment_date = repayment_date;
	}
	public Long getRepayment_scheme_id() {
		return repayment_scheme_id;
	}
	public void setRepayment_scheme_id(Long repayment_scheme_id) {
		this.repayment_scheme_id = repayment_scheme_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber_of_years() {
		return number_of_years;
	}
	public void setNumber_of_years(int number_of_years) {
		this.number_of_years = number_of_years;
	}
	
	
	
	
	

}
