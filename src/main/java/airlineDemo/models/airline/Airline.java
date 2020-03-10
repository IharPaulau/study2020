package airlinedemo.models.airline;

import airlinedemo.models.aircrafts.Plane;

import java.util.*;


public class Airline {
    private String name;
    private List<Plane> planes = new ArrayList<>();

    public Airline(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Plane> getPlanes() {
        return planes;
    }
}

