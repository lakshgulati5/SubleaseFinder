package com.sublease.subleasefinder.models;

import java.sql.Date;

public class Lease {
    private int price;
    private int bedrooms;
    private int bathrooms;
    private boolean sharedBedroom;
    private boolean sharedBathroom;
    private Address address;
    private Date startDate;
    private Date endDate;

    public Lease() {
        
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public int getBathrooms() {
        return bathrooms;
    }
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
    public boolean isSharedBedroom() {
        return sharedBedroom;
    }
    public void setSharedBedroom(boolean sharedBedroom) {
        this.sharedBedroom = sharedBedroom;
    }
    public boolean isSharedBathroom() {
        return sharedBathroom;
    }
    public void setSharedBathroom(boolean sharedBathroom) {
        this.sharedBathroom = sharedBathroom;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
