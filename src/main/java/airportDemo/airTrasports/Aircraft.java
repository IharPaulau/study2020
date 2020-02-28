package airportDemo.airTrasports;

public class Aircraft {

    private int fuelTank;
    private int fuelСonsumption; // per 100 kilometers
    private TypeOfTransport typeOfTransport;

    public Aircraft(int fuelTank, int fuelСonsumption, TypeOfTransport typeOfTransport) {
        this.fuelTank = fuelTank;
        this.fuelСonsumption = fuelСonsumption;
        this.typeOfTransport = typeOfTransport;
    }

    public final int maximumRange() {
        return fuelTank / fuelСonsumption;
    }

        public int getFuelСonsumption() {
        return fuelСonsumption;
    }

    @Override
    public String toString() {
        return " " +
                "fuelTank=" + fuelTank +
                ", fuelWaste=" + fuelСonsumption +
                ", typeOfTransport=" + typeOfTransport +
                "maximym distance " +
                " " + maximumRange();
    }
}
