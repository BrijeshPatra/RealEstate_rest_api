package com.springboot.RealEstate.repositories;

import com.springboot.RealEstate.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
