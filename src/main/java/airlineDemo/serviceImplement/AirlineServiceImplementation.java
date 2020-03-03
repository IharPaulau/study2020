package airlineDemo.serviceImplement;

import airlineDemo.models.airline.Airline;
import airlineDemo.models.aircrafts.CargoPlane;
import airlineDemo.models.aircrafts.PassengerPlane;
import airlineDemo.models.aircrafts.Plane;
import airlineDemo.service.AirlineService;
import org.apache.log4j.Logger;

import java.util.Comparator;
import java.util.List;

public class AirlineServiceImplementation implements AirlineService {
    private static final Logger LOGGER = Logger.getLogger(AirlineServiceImplementation.class);


    @Override
    public Airline makeNewAirline(String name) {
        Airline airline = new Airline(name);
        return airline;
    }

    @Override
    public void buyNewPlane(Airline airline, Plane plane) {
        List<Plane> planes = airline.getPlanes();
        planes.add(plane);
        LOGGER.info(String.format("New plane (modelName='%s') was bought by airport (name='%s')",
                plane.getModelName(), airline.getName()));

    }


    @Override
    public void showAllPlanes(Airline airline) {
        LOGGER.info("display all planes: ");
        for (Plane plane : airline.getPlanes()) {
            LOGGER.info(plane);
        }
    }

    @Override
    public void sortByMaxDistance(Airline airline) {
        LOGGER.info("Sort planes by max distance...");
        List<Plane> planes = airline.getPlanes();
        planes.sort(Comparator.comparing(Plane::getMaxDistance).reversed());
    }

    @Override
    public Plane searchPlaneByParameters(List<Plane> planes, int maxValue, int minValue) {
        for (Plane plane : planes) {
            if (plane.getFuelConsumption() > minValue && plane.getFuelConsumption() < maxValue) {
                LOGGER.info(String.format("this plane (modelName='%s') has fuel consumption in the given parameters " +
                        "from '%d' to '%d'", plane.getModelName(), minValue, maxValue));

                return plane;
            }
        }
            return null;
    }

    @Override
    public int totalCarryingCapacity(Airline airline) {
        int result = 0;
        for (Plane plane : airline.getPlanes()) {
            if (plane instanceof CargoPlane)
                result += ((CargoPlane) plane).getCargoCapacity();
        }
        LOGGER.info(String.format("total carrying capacity of all '%s' planes = '%d'", airline.getName(), result));
        return result;
    }

    @Override
    public int totalPassengerCapacity(Airline airline) {
        int result = 0;
        for (Plane plane : airline.getPlanes()) {
            if (plane instanceof PassengerPlane)
                result += ((PassengerPlane) plane).getPassengerCapacity();
        }
        LOGGER.info(String.format("total passenger capacity of all '%s' planes = '%d'", airline.getName(), result));
        return result;
    }
}

