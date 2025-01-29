package com.sublease.subleasefinder.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sublease.subleasefinder.models.Lease;

@Service
public class LeaseService {
    private List<Lease> leases = new ArrayList<Lease>();

    public void addLease(Lease lease) {
        leases.add(lease);
    }

    public List<Lease> getLeases(){
        return leases;
    }
}
