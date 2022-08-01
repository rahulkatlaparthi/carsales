package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SalesDto;
import com.example.demo.model.Sales;
import com.example.demo.model.Salesperson;
import com.example.demo.repository.SalesPersonRepository;
import com.example.demo.repository.SalesRepository;

@RestController
public class SalesController {
	
	@Autowired
	private SalesRepository sales;
	
	@Autowired
	private SalesPersonRepository person;
	
	@PostMapping("/addsales")
	public Sales addSales(@RequestBody SalesDto sa) {
	     Salesperson per=person.findById(sa.getSalepersonid()).get();
	     Sales se=new Sales();
	     se.setCommissionofsale(sa.getCommissionofsale());
	     se.setSaleperson(per);
	     return sales.save(se);
	     
	}
	
	@GetMapping("/getsales")
	public List<Sales> getSales(){
		return sales.findAll();
	}
	@GetMapping("sales/{id}")
	public Optional<Sales> getScale(@PathVariable Integer id) {
		return sales.findById(id);
	}
	
	@GetMapping("salesperson/{id}")
	public List<Sales> getScalePerson(@PathVariable Integer id) {
	     return sales.findBySalesperson(id);
	}

}
