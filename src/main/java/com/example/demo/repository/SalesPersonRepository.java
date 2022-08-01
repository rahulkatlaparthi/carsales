package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Salesperson;

public interface SalesPersonRepository extends JpaRepository<Salesperson,Integer>{
    
//	@Query(value="SELECT * FROM salesperson u WHERE u.sale_person_id =?1",nativeQuery=true)
//	Salesperson findByPhoneNo(int phone_no);
    
	@Query(value="SELECT * FROM salesperson u WHERE u.phone_no =?1",nativeQuery=true)
	Salesperson findByPhoneNo(Long phone_no);

	
}



