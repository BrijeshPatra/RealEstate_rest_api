package com.springboot.RealEstate.services;

import com.springboot.RealEstate.entity.Property;
import com.springboot.RealEstate.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;
    public List<Property> getAllProperty() {
        return propertyRepository.findAll();
    }

    public Property getAllPropertyById(Long id) {
       return propertyRepository.findById(id).
               orElseThrow(()->new IllegalArgumentException("Invalid property id " + id));
    }

    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    public Property updateProperty(Long id, Property updatedProperty) {
        Property property=propertyRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid property id " + id));
        property.setCustid(updatedProperty.getCustid());
        property.setPaddress(updatedProperty.getPaddress());
        property.setPtype(updatedProperty.getPtype());
        property.setPstatus(updatedProperty.getPstatus());
        property.setProprice(updatedProperty.getProprice());

        return propertyRepository.save(property);
    }

    public void deleteProperty(Long id) {
         propertyRepository.deleteById(id);
    }
}
