package airlineDemo.service;

import airlineDemo.models.aircrafts.CargoPlane;
import airlineDemo.models.aircrafts.PassengerPlane;


public interface PlaneService {

    PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity);

    CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity);

}
