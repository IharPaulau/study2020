package airportDemo.airTrasports;

public abstract class Plane {

    private int fuelTank;
    private int fuelConsumption; // per 100 kilometers
    private String modelName;

    public Plane(int fuelTank, int fuelConsumption, String modelName) {
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxDistance() {
        return fuelTank / fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelTank() {
        return fuelTank;
    }


}
