package com.springboot.RealEstate.controller;

import com.springboot.RealEstate.entity.Requirements;
import com.springboot.RealEstate.services.RequirementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/requirements")
public class RequirementsController {
    @Autowired
    private RequirementsService requirementsService;
    @GetMapping
    public List<Requirements> getAllRequirements(){
        return requirementsService.getAllRequirements();
    }
    @GetMapping("/{id}")
    public Optional<Requirements> getAllRequirementsById(@PathVariable Long id){
        return requirementsService.getAllRequirementsById(id);
    }
    @PostMapping
    public Requirements createRequirements(@RequestBody Requirements requirements){
        return requirementsService.createRequirements(requirements);
    }
    @PutMapping("/{id}")
    public Requirements updateRequirements(@PathVariable Long id, @RequestBody Requirements updateRequirements){
        return requirementsService.updateRequirements(id,updateRequirements);
    }
    @DeleteMapping("/{id}")
    public void deleteRequirements(@PathVariable Long id){
        requirementsService.deleteRequirements(id);
    }
}
