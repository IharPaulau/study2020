package airportDemo.airpotImplement;

import airportDemo.airTrasports.Aircraft;
import airportDemo.airTrasports.Plane;
import airportDemo.airTrasports.TypeOfTransport;
import airportDemo.airportService.AirportService;

public class PlanesService implements AirportService {

    @Override
    public Aircraft buyNewAirplane(String name, int fuelTank, int fuelWase, TypeOfTransport typeOfTransport) {
        return new Plane(name, fuelTank, fuelWase, typeOfTransport);

    }
}




