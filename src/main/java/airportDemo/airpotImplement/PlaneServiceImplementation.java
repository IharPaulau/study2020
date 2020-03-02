package airportDemo.airpotImplement;

import airportDemo.airTrasports.CargoPlane;
import airportDemo.airTrasports.PassengerPlane;
import airportDemo.service.PlaneService;
import org.apache.log4j.Logger;

public class PlaneServiceImplementation implements PlaneService {
    private static final Logger LOGGER = Logger.getLogger(PlaneServiceImplementation.class);



    @Override
    public PassengerPlane createNewPassengerPlane(String name, int fuelTank, int fuelConsumption, int passengerCapacity, int cargoCapacity) {
        PassengerPlane passengerPlane = new PassengerPlane(name, fuelTank, fuelConsumption, passengerCapacity, cargoCapacity);
        LOGGER.info("купили пассажирский самолет");
        return passengerPlane;
    }

    @Override
    public CargoPlane createNewCargoPlane(String name, int fuelTank, int fuelConsumption, int cargoCapacity) {
        CargoPlane cargoPlane = new CargoPlane(name, fuelTank, fuelConsumption, cargoCapacity);
        LOGGER.info("купили грузовой самолет");
        return cargoPlane;
    }
}




