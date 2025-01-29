package com.sublease.subleasefinder.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import com.sublease.subleasefinder.models.Lease;
import com.sublease.subleasefinder.services.LeaseService;

import java.util.List;

@RestController
public class LeaseController {

    @Autowired
    private LeaseService service;  

    @PostMapping("/addLease")  
    public ResponseEntity<Lease> addLease(@RequestBody Lease entity) {
        service.addLease(entity);
        return ResponseEntity.ok(entity); 
    }

    @GetMapping("/leases")  
    public ResponseEntity<List<Lease>> getLeases() {
        return ResponseEntity.ok(service.getLeases());
    }
}
