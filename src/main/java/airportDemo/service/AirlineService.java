package airportDemo.service;

import airportDemo.Airline;
import airportDemo.airTrasports.Plane;

public interface AirlineService {

    Airline makeNewAirline(String name);


    void buyNewPlane(Airline airline, Plane plane);





}
