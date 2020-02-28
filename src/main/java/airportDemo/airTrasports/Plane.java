package airportDemo.airTrasports;

public class Plane extends Aircraft {

    private String modelName;


    public Plane(String modelName, int fuelTank, int fuelWaste, TypeOfTransport typeOfTransport) {
        super(fuelTank, fuelWaste, typeOfTransport);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return modelName + super.toString();
    }
}
