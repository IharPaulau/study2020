package airportDemo.airTrasports;

public class PassengerPlane extends Plane {
    private int passengerCapacity;
    private int cargoCapacity; // a passenger plane also carries some cargo
    private String modelName;


    public PassengerPlane(String modelName, int fuelTank, int fuelConsumption, int passengerCapacity, int cargoCapacity ) {
        super(fuelTank, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
        this.modelName = modelName;
        this.cargoCapacity = cargoCapacity;
    }



    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public String getModelName() {
        return modelName;
    }
}
