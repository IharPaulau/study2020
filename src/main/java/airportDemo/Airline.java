package airportDemo;

import airportDemo.airTrasports.Plane;

import java.util.*;


public class Airline {
    private String name;
    private List<Plane> allplanes = new ArrayList<>();


    public Airline(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Plane> getPlanes() {
        return allplanes;
    }
}

