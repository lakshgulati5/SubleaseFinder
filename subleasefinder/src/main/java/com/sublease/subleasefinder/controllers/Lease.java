package com.sublease.subleasefinder.controllers;

public class Lease {
    private String location;
    private Double price;
    private Boolean shared;

    public Lease() {
        location = "None";
        price = 0.0;
        shared = false;
    }

    public Lease(String location, Double price, Boolean shared) {
        this.location = location;
        this.price = price;
        this.shared = shared;
    }

    public String toString() {
        return location;
    }
}
