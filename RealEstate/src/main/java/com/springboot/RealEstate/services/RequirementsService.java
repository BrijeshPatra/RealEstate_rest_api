package com.springboot.RealEstate.services;

import com.springboot.RealEstate.entity.Requirements;
import com.springboot.RealEstate.repositories.RequirementsRepository;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsService {
    @Autowired
    private RequirementsRepository requirementsRepository;

    public List<Requirements> getAllRequirements() {
         return requirementsRepository.findAll();
    }

    public Optional<Requirements> getAllRequirementsById(Long id) {
        return requirementsRepository.findById(id);
    }

    public Requirements createRequirements(Requirements requirements) {
        return requirementsRepository.save(requirements);
    }

    public Requirements updateRequirements(Long id, Requirements updateRequirements) {
        Requirements requirements= requirementsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Requirement id " + id));
        requirements.setArea(requirements.getArea());
        requirements.setPlace(requirements.getPlace());
        requirements.setPrice(requirements.getPrice());
        requirements.setReqby(requirements.getReqby());
        requirements.setPtype(requirements.getPtype());

        return requirementsRepository.save(requirements);
    }

    public void deleteRequirements(Long id) {
        requirementsRepository.deleteById(id);
    }
}
