package airportDemo.serviceImplement;

import airportDemo.airTrasports.CargoPlane;
import airportDemo.airTrasports.PassengerPlane;
import airportDemo.service.PlaneService;
import org.apache.log4j.Logger;

public class PlaneServiceImplementation implements PlaneService {
    private static final Logger LOGGER = Logger.getLogger(PlaneServiceImplementation.class);

    @Override
    public PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity) {
        PassengerPlane passengerPlane = new PassengerPlane(fuelTank, fuelConsumption, name, passengerCapacity);
        LOGGER.info(String.format("new passenger plane created. modelname = '%s'", passengerPlane.getModelName()));
        return passengerPlane;
    }

    @Override
    public CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity) {
        CargoPlane cargoPlane = new CargoPlane(fuelTank, fuelConsumption, name, cargoCapacity);
        LOGGER.info(String.format("new cargo plane created. modelname = '%s'", cargoPlane.getModelName()));
        return cargoPlane;
    }
}




