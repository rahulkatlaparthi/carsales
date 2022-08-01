package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="sale")
public class Sales {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sale_id;
	
	private Long commissionofsale;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "sale_person_id")
    
    private Salesperson saleperson;

	public int getSale_id() {
		return sale_id;
	}

	public void setSale_id(int sale_id) {
		this.sale_id = sale_id;
	}

	public Long getCommissionofsale() {
		return commissionofsale;
	}

	public void setCommissionofsale(Long commissionofsale) {
		this.commissionofsale = commissionofsale;
	}

	public Salesperson getSaleperson() {
		return saleperson;
	}

	public void setSaleperson(Salesperson saleperson) {
		this.saleperson = saleperson;
	}

	
	
	

}
