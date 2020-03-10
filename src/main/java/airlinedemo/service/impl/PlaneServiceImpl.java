package airlinedemo.service.impl;

import airlinedemo.models.aircrafts.CargoPlane;
import airlinedemo.models.aircrafts.PassengerPlane;
import airlinedemo.service.PlaneService;
import org.apache.log4j.Logger;

public class PlaneServiceImpl implements PlaneService {
    private static final Logger LOGGER = Logger.getLogger(PlaneServiceImpl.class);

    @Override
    public PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity) {
        PassengerPlane passengerPlane = new PassengerPlane(fuelTank, fuelConsumption, name, passengerCapacity);
        LOGGER.info(String.format("New passenger plane created. ModelName = '%s'", passengerPlane.getModelName()));
        return passengerPlane;
    }

    @Override
    public CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity) {
        CargoPlane cargoPlane = new CargoPlane(fuelTank, fuelConsumption, name, cargoCapacity);
        LOGGER.info(String.format("New cargo plane created. ModelName = '%s'", cargoPlane.getModelName()));
        return cargoPlane;
    }
}




