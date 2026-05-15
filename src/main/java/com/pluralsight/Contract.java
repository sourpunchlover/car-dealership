package com.pluralsight;

public abstract class Contract {
    protected String dateOfContract, customerName, customerEmail;
    protected double totalPrice, monthlyPayment;
    protected  boolean vehicleSold;//might have to change this & update getter & setter later

    //constructor, all fields except total
    //price and monthly payment
    public Contract(String dateOfContract, String customerName, String customerEmail, boolean vehicleSold) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    //getters & setters

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();
}
