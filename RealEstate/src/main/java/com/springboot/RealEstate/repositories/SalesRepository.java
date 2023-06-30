package com.springboot.RealEstate.repositories;

import com.springboot.RealEstate.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales,Long> {

}
