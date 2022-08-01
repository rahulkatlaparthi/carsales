package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CarDto;
import com.example.demo.model.Car;
import com.example.demo.model.Customer;
import com.example.demo.model.Salesperson;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.SalesPersonRepository;

@RestController
public class CarController {
	
	@Autowired
	private CarRepository carrepo;
	
	@Autowired
	private CustomerRepository cust;
	
	@Autowired
	private SalesPersonRepository sales;
	
	@PostMapping("/addcar")
	public Car addCar(@RequestBody CarDto car) {
		Customer customer=cust.findById(car.getCutomer_number()).get();
		Salesperson sale=sales.findById(car.getSale_person_id()).get();
		 Car ca=new Car();
		 ca.setCutomer(customer);
		 ca.setSalesperson(sale);
		 ca.setMake(car.getMake());
		 ca.setModel(car.getModel());
		 ca.setPrice(car.getPrice());
		 ca.setYear(car.getYear());
		 return carrepo.save(ca);
		
	}
	
	@GetMapping("/getcars")
	public List<Car> getCars(){
		return carrepo.findAll();
	}

}
