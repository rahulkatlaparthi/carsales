package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Repaymentscheme;

@Repository
public interface RepaymentRepository extends JpaRepository<Repaymentscheme,Long>{

}
