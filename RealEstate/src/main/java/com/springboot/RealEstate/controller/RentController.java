package com.springboot.RealEstate.controller;

import com.springboot.RealEstate.entity.Rent;
import com.springboot.RealEstate.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent")
public class RentController {
    @Autowired
    public RentService rentService;

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.getAllRents();
    }

    @GetMapping("/{id}")
    public Rent getRentById(@PathVariable Long id) {
        return rentService.getRentById(id);
    }

    @PostMapping
    public Rent createRent(@RequestBody Rent rent) {
        return rentService.createRent(rent);
    }
    @PutMapping("/{id}")
    public Rent updateRent(@PathVariable Long id, @RequestBody Rent updatedRent) {
        return rentService.updateRent(id, updatedRent);
    }
    @DeleteMapping
    public void deleteRent(@PathVariable Long id){
        rentService.deleteRent(id);
    }
}
