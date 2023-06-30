package com.springboot.RealEstate.repositories;

import com.springboot.RealEstate.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Long> {

}
