package com.springboot.RealEstate.services;

import com.springboot.RealEstate.entity.Sales;
import com.springboot.RealEstate.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    public Sales getSalesByPropertyId(Long propid) {
        return salesRepository.findById(propid)
                .orElseThrow(() -> new IllegalArgumentException("Sales not found for property ID: " + propid));
    }

    public Sales createSales(Sales sales) {
        return salesRepository.save(sales);
    }

    public Sales updateSales(Long propid, Sales updatedSales) {
        Sales sales = salesRepository.findById(propid)
                .orElseThrow(() -> new IllegalArgumentException("Sales not found for property ID: " + propid));

        sales.setSold(updatedSales.isSold());
        sales.setPrice(updatedSales.getPrice());

        return salesRepository.save(sales);
    }

    public void deleteSales(Long propid) {
        salesRepository.deleteById(propid);
    }
}
