package airlineDemo.serviceImplement;

import airlineDemo.models.aircrafts.CargoPlane;
import airlineDemo.models.aircrafts.PassengerPlane;
import airlineDemo.models.aircrafts.Plane;
import airlineDemo.models.airline.Airline;
import airlineDemo.service.AirlineService;
import airlineDemo.service.PlaneService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AirlineServiceImplementationTest {
    private AirlineService airlineService;
    private PlaneService planeService;
    private Airline airline = new Airline("test airport");
    private Plane test_plane;

    public AirlineServiceImplementationTest() {
    }

    @Before
    public void init() {
        fillListByTestPlanes();
        this.airlineService = new AirlineServiceImplementation();
        this.planeService = new PlaneServiceImplementation();
        test_plane = new PassengerPlane(0, 0, "test", 0);
    }

    private void fillListByTestPlanes() {
        this.airline.getPlanes().addAll(Arrays.asList(new PassengerPlane(270000, 53, "test1", 200),
                new PassengerPlane(300000, 60, "test2", 250),
                new CargoPlane(250000, 45, "test3", 20),
                new CargoPlane(550000, 70, "test4", 50)));
    }

    @Test
    public void test_makeNewAirline() {
        Airline airline = this.airlineService.makeNewAirline("ASD");
        Assert.assertNotNull("Airport is null", airline);
        Assert.assertEquals("ASD", airline.getName());
        Assert.assertEquals(0, airline.getPlanes().size());
    }

    @Test
    public void test_buyNewPlane() {
        List<Plane> planes = airline.getPlanes();
        planes.add(planeService.createNewPassengerPlane("test", 0, 0, 0));
        Assert.assertNotNull(planes);
        Assert.assertTrue(planes.get(0).getModelName() == test_plane.getModelName());
    }


    @Test
    public void test_sortByMaxDistance() {
        airlineService.sortByMaxDistance(airline);
        Assert.assertTrue(airline.getPlanes().get(0).getMaxDistance() > airline.getPlanes().get(1).getMaxDistance());
        Assert.assertTrue(airline.getPlanes().get(1).getMaxDistance() > airline.getPlanes().get(2).getMaxDistance());

    }

    @Test
    public void test_searchPlaneByParameters() {
        int maxValue = 50, minValue = 30;
        Assert.assertEquals("test3", airlineService.searchPlaneByParameters(airline.getPlanes(), maxValue, minValue).getModelName());
    }

    @Test
    public void test_totalCarryingCapacity() {
        Assert.assertEquals(70, airlineService.totalCarryingCapacity(airline));
    }

    @Test
    public void test_totalPassengerCapacity() {
        Assert.assertEquals(450, airlineService.totalPassengerCapacity(airline));
    }


}