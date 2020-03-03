package airlineDemo.service;

import airlineDemo.models.airline.Airline;
import airlineDemo.models.aircrafts.Plane;

import java.util.List;


public interface AirlineService {

    Airline makeNewAirline(String name);

    void buyNewPlane(Airline airline, Plane plane);

    public void showAllPlanes(Airline airline);

    public void sortByMaxDistance(Airline airline);

    public Plane searchPlaneByParameters(List<Plane> planes, int maxValue, int minValue);

    public int totalPassengerCapacity(Airline airline);

    public int totalCarryingCapacity(Airline airline);


}
