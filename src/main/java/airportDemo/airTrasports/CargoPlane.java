package airportDemo.airTrasports;

public class CargoPlane extends Plane {

    private int cargoCapacity;
    private String modelName;


    public CargoPlane(String modelName, int fuelTank, int fuelConsumption, int cargoCapacity) {
        super(fuelTank, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
        this.modelName = modelName;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public String getModelName() {
        return modelName;
    }
}
