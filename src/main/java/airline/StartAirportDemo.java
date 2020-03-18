package airline;


import airline.models.airline.Airline;
import airline.service.impl.AirlineServiceImpl;
import airline.service.impl.PlaneServiceImpl;
import airline.service.AirlineService;
import airline.service.PlaneService;


public class StartAirportDemo {
    private static AirlineService airlineService = new AirlineServiceImpl();
    private static PlaneService planeService = new PlaneServiceImpl();

    public static void main(String[] args) {
        Airline airline = airlineService.createNewAirline("Grodno_AIR");
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boeing708", 270000,
                53, 150));
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boeing709", 250000,
                55, 155));
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boeing727", 300000,
                78, 200));
        airlineService.buyNewPlane(airline, planeService.createNewPassengerPlane("Boeing737", 270000,
                53, 250));
        airlineService.buyNewPlane(airline, planeService.createNewCargoPlane("Boeing608", 250000,
                48, 25));
        airlineService.buyNewPlane(airline, planeService.createNewCargoPlane("Boeing609", 300000,
                60, 35));

        airlineService.showAllPlanes(airline);
        airlineService.sortByMaxDistance(airline);
        airlineService.showAllPlanes(airline);
        airlineService.searchPlaneByParameters(airline.getPlanes(), 50, 30);
        airlineService.totalPassengerCapacity(airline);
        airlineService.totalCarryingCapacity(airline);
    }
}

