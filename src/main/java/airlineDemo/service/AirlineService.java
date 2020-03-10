package airlinedemo.service;

import airlinedemo.models.airline.Airline;
import airlinedemo.models.aircrafts.Plane;

import java.util.List;


public interface AirlineService {

    Airline createNewAirline(String name);

    void buyNewPlane(Airline airline, Plane plane);

    void showAllPlanes(Airline airline);

    void sortByMaxDistance(Airline airline);

    Plane searchPlaneByParameters(List<Plane> planes, int maxValue, int minValue);

    int totalPassengerCapacity(Airline airline);

    int totalCarryingCapacity(Airline airline);


}
