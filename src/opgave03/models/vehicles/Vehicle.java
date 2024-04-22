package opgave03.models.vehicles;

import opgave03.models.VehicleComponent;

public abstract class Vehicle extends VehicleComponent {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return make + " " + model;
    }
}

