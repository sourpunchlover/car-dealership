package com.pluralsight;

public class SalesContract extends Contract {
    private boolean isFinanced;

    //constructor
    public SalesContract(String dateOfContract, String customerName,
                         String customerEmail, Vehicle vehicleSold,
                         boolean isFinanced) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.isFinanced = isFinanced;
    }

    // getter for isFinanced
    public boolean isFinanced() {
        return isFinanced;
    }

    // setter for isFinanced
    public void setIsFinanced(boolean isFinanced) {
        this.isFinanced = isFinanced;
    }

    // override getTotalPrice()
    @Override
    public double getTotalPrice() {
        double vehiclePrice = vehicleSold.getPrice();
        double salesTax = vehiclePrice * 0.05;
        double recordingFee = 100.00;
        double processingFee;

        if (vehiclePrice < 10000) {
            processingFee = 295.00;
        } else {
            processingFee = 495.00;
        }
        return vehiclePrice + salesTax + recordingFee + processingFee;
    }

    // override getMonthlyPayment()
    @Override
    public double getMonthlyPayment() {
        if (!isFinanced) {
             return 0;
        }

        double totalPrice = getTotalPrice();
        double monthlyRate;
        int months;

        if (totalPrice >= 10000) {
            monthlyRate = 0.0425 / 12;
            months = 48;
        } else {
            monthlyRate = 0.0525 / 12;
            months = 24;
        }

        double monthlyPayment = (totalPrice * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
        return monthlyPayment;
}   }
