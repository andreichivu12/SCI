package org.example;

public abstract class Vehicle implements Drivable {
    protected double availableFuel;
    protected int tyreSize;
    protected String chassisNumber;

    public Vehicle(double availableFuel, int tyreSize, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.tyreSize = Math.min(tyreSize, 15);
        this.chassisNumber = chassisNumber;
    }

    @Override
    public abstract String start();

    @Override
    public abstract String stop();

    @Override
    public abstract String drive(int distance);

    public String getChassisNumber() {
        return chassisNumber;
    }
}
