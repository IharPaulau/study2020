package airlinedemo.models.aircrafts;

public class PassengerPlane extends Plane {

    private int passengerCapacity;

    public PassengerPlane(int fuelTank, int fuelConsumption, String modelName, int passengerCapacity) {
        super(fuelTank, fuelConsumption, modelName);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }


    @Override
    public String toString() {
        return "PassengerPlane{" +
                " passengerCapacity = " + passengerCapacity +
                " fuelTank " + getFuelTank() +
                " fuelConsumption " + getFuelConsumption() +
                " maxdistance = " + getMaxDistance() +
                '}';
    }
}
