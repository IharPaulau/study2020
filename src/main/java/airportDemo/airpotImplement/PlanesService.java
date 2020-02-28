package airportDemo.airpotImplement;

import airportDemo.Airport;
import airportDemo.airTrasports.Aircraft;
import airportDemo.airTrasports.Plane;
import airportDemo.airTrasports.TypeOfTransport;
import airportDemo.airportService.AirportService;
import org.apache.log4j.Logger;

public class PlanesService implements AirportService {
    private static final Logger logPlaneService = Logger.getLogger(Airport.class);


    @Override
    public Aircraft buyNewAirplane(String name, int fuelTank, int fuelWase, TypeOfTransport typeOfTransport) {
        logPlaneService.info(" купили новый самолет" );
        return new Plane(name, fuelTank, fuelWase, typeOfTransport);

    }
}




