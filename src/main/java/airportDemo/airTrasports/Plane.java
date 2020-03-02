package airportDemo.airTrasports;

public class Plane {

    private int fuelTank;
    private int fuelConsumption; // per 100 kilometers


    public Plane(int fuelTank, int fuelConsumption) {
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;

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

    @Override
    public String toString() {
        return " " +
                "fuelTank=" + fuelTank +
                ", fuelWaste=" + fuelConsumption +
                "maximum distance " +
                " " + getMaxDistance();
    }
}
