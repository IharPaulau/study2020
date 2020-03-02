package airportDemo.airpotImplement;

import airportDemo.Airline;
import airportDemo.airTrasports.Plane;
import airportDemo.service.AirlineService;
import org.apache.log4j.Logger;

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
//        LOGGER.info(String.format("New plane (modelName='%s') was bought by airport (name='%s')");

    }
}
