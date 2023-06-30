package com.springboot.RealEstate.services;

import com.springboot.RealEstate.entity.Rent;
import com.springboot.RealEstate.repositories.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentService {
    @Autowired
    public RentRepository rentRepository;
    public List<Rent> getAllRents() {
        return rentRepository.findAll();
    }

    public Rent getRentById(Long id) {
        return rentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid rent ID" + id));

    }

    public Rent createRent(Rent rent) {
        return rentRepository.save(rent);
    }

    public Rent updateRent(Long id, Rent updatedRent) {
        Rent rent=rentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id " + id));
        rent.setRented(updatedRent.isRented());
        rent.setRent(updatedRent.getRent());
        rent.setAdvance(updatedRent.getAdvance());

        return rentRepository.save(rent);
    }
    public void deleteRent(Long id) {
        rentRepository.deleteById(id);
    }
}
