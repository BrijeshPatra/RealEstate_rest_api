package com.springboot.RealEstate.repositories;

import com.springboot.RealEstate.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
