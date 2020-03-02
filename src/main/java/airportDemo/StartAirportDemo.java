package airportDemo;


import airportDemo.airpotImplement.AirlineServiceImplementation;
import airportDemo.airpotImplement.PlaneServiceImplementation;
import airportDemo.service.AirlineService;
import airportDemo.service.PlaneService;

public class StartAirportDemo {
    private static AirlineService airportService = new AirlineServiceImplementation();
    private static PlaneService planeService = new PlaneServiceImplementation();

    public static void main(String[] args) {


        Airline airline = airportService.makeNewAirline("Бел-Авиа");
        airportService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing708", 270000,
                53, 150, 2));
        airportService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing709", 250000,
                55, 155, 3));
        airportService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing727", 300000,
                78,200, 5));
        airportService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing737", 270000,
                53, 250, 6));
        airportService.buyNewPlane(airline, planeService.createNewCargoPlane("Boing608", 250000,
                48, 25));
        airportService.buyNewPlane(airline, planeService.createNewCargoPlane("Boing609", 300000,
                60,35));


    }


}

