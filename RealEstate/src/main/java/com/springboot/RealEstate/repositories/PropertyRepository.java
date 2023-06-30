package com.springboot.RealEstate.repositories;

import com.springboot.RealEstate.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Long> {

}
