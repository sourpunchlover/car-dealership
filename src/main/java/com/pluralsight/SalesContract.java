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
        return 0; // todo
    }

    // override getMonthlyPayment()
    @Override
    public double getMonthlyPayment() {
        return 0; // todo
    }
}
