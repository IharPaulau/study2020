package airline.service;

import airline.models.aircrafts.CargoPlane;
import airline.models.aircrafts.PassengerPlane;


public interface PlaneService {

    PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity);

    CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity);

}
