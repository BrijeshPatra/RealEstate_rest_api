package com.springboot.RealEstate.controller;

import com.springboot.RealEstate.entity.Sales;
import com.springboot.RealEstate.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping
    public List<Sales> getAllSales() {
        return salesService.getAllSales();
    }

    @GetMapping("/{propid}")
    public Sales getSalesByPropertyId(@PathVariable Long propid) {
        return salesService.getSalesByPropertyId(propid);
    }

    @PostMapping
    public Sales createSales(@RequestBody Sales sales) {
        return salesService.createSales(sales);
    }

    @PutMapping("/{propid}")
    public Sales updateSales(@PathVariable Long propid, @RequestBody Sales updatedSales) {
        return salesService.updateSales(propid, updatedSales);
    }

    @DeleteMapping("/{propid}")
    public void deleteSales(@PathVariable Long propid) {
        salesService.deleteSales(propid);
    }
}
