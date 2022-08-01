package com.example.demo.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Repaymentscheme;
import com.example.demo.repository.RepaymentRepository;

@RestController
public class RepaymentController {
	
	@Autowired
	private RepaymentRepository rep;
	
	@PostMapping("/addscheme")
	
	public Repaymentscheme addScheme(@RequestBody Repaymentscheme repay) {
		
		Calendar calendar = Calendar.getInstance();
		Repaymentscheme repaymentscheme=new Repaymentscheme();
		repaymentscheme.setLoan_date(calendar.getTime());
		calendar.add(Calendar.YEAR, repay.getNumber_of_years());
		repaymentscheme.setRepayment_date(calendar.getTime());
		repaymentscheme.setName(repay.getName());
		repaymentscheme.setNumber_of_years(repay.getNumber_of_years());
		repaymentscheme.setRepayment_scheme_id(repay.getRepayment_scheme_id());
		
		return rep.save(repaymentscheme);
	}
	
	
	@GetMapping("/getscheme")
	public List<Repaymentscheme> getScheme(){
		return rep.findAll();
	}

}
