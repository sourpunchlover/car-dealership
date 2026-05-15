package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name, address, phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }

        public ArrayList<Vehicle> getVehiclesByMakeModel ( String make, String model) {
            ArrayList<Vehicle> result = new ArrayList<>();
            for (Vehicle v : inventory) {
                if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                    result.add(v);
                }
            }
            return result;
        }
        public ArrayList<Vehicle> getVehiclesByPrice ( double min, double max){
            ArrayList<Vehicle> result = new ArrayList<>();
            for (Vehicle v : inventory) {
                if (v.getPrice() >= min && v.getPrice() <= max) {
                    result.add(v);
                }
            }
            return result;
        }
        public ArrayList<Vehicle> getVehiclesByYear ( int min, int max){
            return null;
        }
        public ArrayList<Vehicle> getVehiclesByColor (String color){
            return null;
        }
        public ArrayList<Vehicle> getVehiclesByMileage ( int min, int max){
            return null;
        }
        public ArrayList<Vehicle> getVehiclesByType (String vehicleType){
            return null;
        }
        public ArrayList<Vehicle> getAllVehicles () {
            return this.inventory;
        }
        public void addVehicle (Vehicle vehicle){
            this.inventory.add(vehicle);
        }
        public void removeVehicle (Vehicle vehicle){
            //this.inventory.remove(vehicle)
        }


        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getAddress () {
            return address;
        }

        public void setAddress (String address){
            this.address = address;
        }

        public String getPhone () {
            return phone;
        }

        public void setPhone (String phone){
            this.phone = phone;
        }

}
