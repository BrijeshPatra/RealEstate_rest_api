package com.springboot.RealEstate.controller;

import com.springboot.RealEstate.entity.Property;
import com.springboot.RealEstate.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;
    @GetMapping
    public List<Property> getAllProperty(){
        return propertyService.getAllProperty();
    }
    @GetMapping("/{id}")
    public Property getAllPropertyById(@PathVariable Long id){
        return propertyService.getAllPropertyById(id);
    }
    @PostMapping
    public Property createProperty(@RequestBody Property property){
        return propertyService.createProperty(property);
    }
    @PutMapping
    public Property updateProperty(@PathVariable Long id,@RequestBody Property updatedProperty){
        return propertyService.updateProperty(id,updatedProperty);
    }
    @DeleteMapping
    public void deleteProperty(@PathVariable Long id){
         propertyService.deleteProperty(id);
    }
}
