package airlinedemo.service;

import airlinedemo.models.aircrafts.CargoPlane;
import airlinedemo.models.aircrafts.PassengerPlane;


public interface PlaneService {

    PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity);

    CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity);

}
