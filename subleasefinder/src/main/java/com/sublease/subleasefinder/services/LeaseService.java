package com.sublease.subleasefinder.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sublease.subleasefinder.models.Lease;

import com.mongodb.client.MongoDatabase;

@Service
public class LeaseService {
    private List<Lease> leases = new ArrayList<Lease>();

    public LeaseService(){
        MongoDatabase db = MongoDBConnection.getDb();
    }

    public void addLease(Lease lease) {
        leases.add(lease);
    }

    public List<Lease> getLeases(){
        return leases;
    }
}
