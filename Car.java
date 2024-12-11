package org.example;

public class Car extends Vehicle {

    private final double fuelTankSize;
    private final String fuelType;
    private final int maxGears = 6;
    private final double consumptionPer100Km;

    public Car(double fuelTankSize, String fuelType, double consumptionPer100Km, double availableFuel, int tyreSize, String chassisNumber) {
        super(availableFuel, tyreSize, chassisNumber);
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    @Override
    public String start() {
        return "Car with chassis number: " + chassisNumber + " has started.";
    }

    @Override
    public String stop() {
        return "Car with chassis number: " + chassisNumber + " has stopped.";
    }

    @Override
    public String drive(int distance) {
        double fuelNeeded = calculateConsumption() * distance / 100;
        if (fuelNeeded <= availableFuel) {
            availableFuel -= fuelNeeded;
            return "Drove for " + distance + " km. Fuel consumption: " + fuelNeeded + " liters. Remaining fuel: " + availableFuel + " liters.";
        } else {
            return "Not enough fuel in the tank.";
        }
    }

    private double calculateConsumption() {
        double adjustedConsumption = consumptionPer100Km;

        if (tyreSize > 15) {
            adjustedConsumption *= 1.05;
        }

        return adjustedConsumption;
    }
}


