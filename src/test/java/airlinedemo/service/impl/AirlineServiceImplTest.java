package airlinedemo.service.impl;

import airlinedemo.models.aircrafts.CargoPlane;
import airlinedemo.models.aircrafts.PassengerPlane;
import airlinedemo.models.aircrafts.Plane;
import airlinedemo.models.airline.Airline;
import airlinedemo.service.AirlineService;
import airlinedemo.service.PlaneService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineServiceImplTest {
    private AirlineService airlineService;
    private PlaneService planeService;
    private Airline test_airline = new Airline("test airline");


    @Before
    public void init() {
        fillListByTestPlanes();
        this.airlineService = new AirlineServiceImpl();
        this.planeService = new PlaneServiceImpl();

    }

    private void fillListByTestPlanes() {
        this.test_airline.getPlanes().addAll(Arrays.asList(new PassengerPlane(270000, 53, "test1", 200),
                new PassengerPlane(300000, 60, "test2", 250),
                new CargoPlane(250000, 45, "test3", 20),
                new CargoPlane(550000, 70, "test4", 50)));
    }

    @Test
    public void shouldBeNotNullAndHaveExpectedNameAndList_whenNewClassInstanceCreated() {
        Airline airline = airlineService.createNewAirline("Grodno_AIR");
        Assert.assertNotNull("Airline is null", airline);
        assertEquals("Grodno_AIR", airline.getName());
        assertEquals(0, airline.getPlanes().size());
    }

    @Test
    public void shouldHaveExpectedName_whenNewPlaneAddedToList() {
        List<Plane> planes = test_airline.getPlanes();
        planes.add(planeService.createNewPassengerPlane("test5", 0, 0, 0));
        assertEquals("test5", planes.get(planes.size() - 1).getModelName());
    }

    @Test
    public void shouldBeLocatedFromMaxToMin_whenSortByMaxDistance() {
        airlineService.sortByMaxDistance(test_airline);
        assertTrue(test_airline.getPlanes().get(0).getMaxDistance() > test_airline.getPlanes().get(1).getMaxDistance());
        assertTrue(test_airline.getPlanes().get(1).getMaxDistance() > test_airline.getPlanes().get(2).getMaxDistance());
    }

    @Test
    public void shouldFindPlane_whenFuelConsumptionIsSet() {
        int maxValue = 50;
        int minValue = 30;
        assertEquals("test3", airlineService.searchPlaneByParameters(test_airline.getPlanes(), maxValue, minValue).getModelName());
    }

    @Test
    public void shouldGetExpectedValueOfCarryingCapacity_whenSumCarryingCapacityAllPlanes() {
        assertEquals(70, airlineService.totalCarryingCapacity(test_airline));
    }

    @Test
    public void shouldGetExpectedValueOfPassengerCapacity_whenSumPassengerCapacityAllPlanes() {
        assertEquals(450, airlineService.totalPassengerCapacity(test_airline));
    }
}