package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Customer;
import com.example.demo.model.Repaymentscheme;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.RepaymentRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository cust;
	
	@Autowired
	private RepaymentRepository rep;
	
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody CustomerDto customer) {
		Repaymentscheme repayment=rep.findById(customer.getRepayment_scheme_id()).get();
		
		Customer cus=new Customer();
		
		cus.setRepayment(repayment);
		cus.setAddress(customer.getAddress());
		cus.setName(customer.getName());
		cus.setPhoneNumber(customer.getPhoneNumber());
		
		return cust.save(cus);
		
     
}
	@GetMapping("/getcustomer")
	public List<Customer> getCustomer(){
		return cust.findAll();
	}
	
}
