package airlineDemo.models.aircrafts;

public class CargoPlane extends Plane {

    private int cargoCapacity;

    public CargoPlane(int fuelTank, int fuelConsumption, String modelName, int cargoCapacity) {
        super(fuelTank, fuelConsumption, modelName);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                " cargoCapacity=" + cargoCapacity +
                " fueltank " + super.getFuelTank() +
                " fuelconsumption " + super.getFuelConsumption() +
                " maksimum distance = " + super.getMaxDistance() +
                '}';
    }
}
