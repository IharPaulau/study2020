package airportDemo.service;

import airportDemo.airTrasports.CargoPlane;
import airportDemo.airTrasports.PassengerPlane;


public interface PlaneService {

    PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity);

    CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity);

}
