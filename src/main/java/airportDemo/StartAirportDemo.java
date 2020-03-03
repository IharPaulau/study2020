package airportDemo;


import airportDemo.serviceImplement.AirlineServiceImplementation;
import airportDemo.serviceImplement.PlaneServiceImplementation;
import airportDemo.service.AirlineService;
import airportDemo.service.PlaneService;


public class StartAirportDemo {

    private static AirlineService airlineService = new AirlineServiceImplementation();
    private static PlaneService planeService = new PlaneServiceImplementation();

    public static void main(String[] args) {


        Airline airline = airlineService.makeNewAirline("Бел-Авиа");
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing708", 270000,
                53, 150));
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing709", 250000,
                55, 155));
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing727", 300000,
                78,200));
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boing737", 270000,
                53, 250));
        airlineService.buyNewPlane(airline, planeService.createNewCargoPlane("Boing608", 250000,
                48, 25));
        airlineService.buyNewPlane(airline, planeService.createNewCargoPlane("Boing609", 300000,
                60,35));


        airlineService.showAllPlanes(airline);
        airlineService.sortByMaxDistance(airline);
        airlineService.showAllPlanes(airline);
        airlineService.searchPlaneByParameters(airline.getPlanes(), 50, 30);
        airlineService.totalPassengerCapacity(airline);
        airlineService.totalCarryingCapacity(airline);


    }


}

