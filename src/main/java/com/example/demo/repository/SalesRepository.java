package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Sales;


public interface SalesRepository extends JpaRepository<Sales,Integer>{
	@Query(value="SELECT * FROM sale u WHERE u.phone_no =?1",nativeQuery=true)
    List<Sales> findBySalesperson(Integer id);

}
