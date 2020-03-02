package airportDemo.service;

import airportDemo.airTrasports.CargoPlane;
import airportDemo.airTrasports.PassengerPlane;
import airportDemo.airTrasports.Plane;

public interface PlaneService {

    PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity, int cargoCapacity);

    CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity);

}
