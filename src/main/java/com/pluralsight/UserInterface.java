package com.pluralsight;


import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public UserInterface() {
        //leave empty 4 now
    }

    private void init() {
        DealershipFileManager manager = new DealershipFileManager() ;
        this.dealership = manager.getDealership();
    }

    public void display() {
        init();
        while (true) {
            System.out.println("What would you like to do today? ");
            System.out.println("\t1) Find vehicles within a price range");
            System.out.println("\t2) Find vehicles by make / model");
            System.out.println("\t3) Find vehicles by year range");
            System.out.println("\t4) Find vehicles by color");
            System.out.println("\t5) Find vehicles by mileage range");
            System.out.println("\t6) Find vehicles by type (car, truck, SUV, van)");
            System.out.println("\t7) List ALL vehicles");
            System.out.println("\t8) Add a vehicle");
            System.out.println("\t9) Remove a vehicle");
            System.out.println("\t99) Quit");
            System.out.print("Enter your selection: ");
            String userOption = scanner.nextLine();

            switch (userOption) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "99":
                    //Quit
                    System.out.println("Thanks for using...?");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option entered. Try again.");
                    System.out.println("\n");
            }//closing curly for switch

        }//closing curly for while

    }
    //Process methods
    public void processGetByPriceRequest() {
        System.out.println("Enter min price of vehicle: ");
        double min = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter max price of vehicle: ");
        double max = scanner.nextDouble();
        scanner.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicles);
    }

    public void processGetByMakeModelRequest() {
        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();
        List<Vehicle> vehicles = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicles);
    }

    public void processGetByYearRequest() {
        System.out.println("Enter min vehicle year: ");
        int minYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter max vehicle year: ");
        int maxYear = scanner.nextInt();
        scanner.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByYear(minYear, maxYear);
        displayVehicles(vehicles);
    }

    public void processGetByColorRequest() {
    }

    public void processGetByMileageRequest() {
    }

    public void processGetByVehicleTypeRequest() {
    }

    public void processGetAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }
    public void processAddVehicleRequest() {
    }

    public void processRemoveVehicleRequest() {
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.printf("Vin: %d | Year: %d | Odometer: %d | Make: %s | Model: %s | Color: %s | VehicleType: %s | Price: %.2f%n", v.getVin(), v.getYear(), v.getOdometer(), v.getMake(), v.getModel(), v.getColor(), v.getVehicleType(), v.getPrice());
        }

    }

    public void processAllVehiclesRequest() {

    }

}
