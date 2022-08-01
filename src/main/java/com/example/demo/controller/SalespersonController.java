package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Salesperson;
import com.example.demo.repository.SalesPersonRepository;

@RestController
public class SalespersonController {
	
	@Autowired
	private SalesPersonRepository sales;
	
	@PostMapping("/addsalesperson")
	public String addPerson(@RequestBody Salesperson pers) {
		Salesperson sal=sales.findByPhoneNo(pers.getPhone_no());
		if(sal!=null) {
			return "Phnone Number already exist";
		}
		 sales.save(pers);
		 return "Sales Person Added";
	}
	
	
	@GetMapping("/allpersons")
	
	public List<Salesperson> getPerson(){
		return sales.findAll();
	}

}
