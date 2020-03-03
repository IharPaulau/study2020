package airportDemo.airTrasports;

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
        return "CargoPlane{" +
                " passengerCapacity=" + passengerCapacity +
                " fueltank " + super.getFuelTank() +
                " fuelconsumption " + super.getFuelConsumption() +
                " maksimum distance = " + super.getMaxDistance() +
                '}';
    }
}
