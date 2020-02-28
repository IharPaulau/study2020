package airportDemo;

import airportDemo.Comporators.RangeComporator;
import airportDemo.airTrasports.Aircraft;
import airportDemo.airTrasports.TypeOfTransport;
import airportDemo.airportService.AirportService;
import airportDemo.airpotImplement.PlanesService;

import java.util.*;


public class Airport {

    private String name;
    List<Aircraft> allplanes = new ArrayList<>();


    public Airport(String name) {

        this.name = name;
    }


    AirportService planesService = new PlanesService();

    void print() {

        for (Aircraft а : allplanes) {
            System.out.println(а.toString());
        }
    }


    void sort() {
        Comparator speedComparator = new RangeComporator();
        Collections.sort(allplanes, speedComparator);
    }

    void search() {

        for (Aircraft s : allplanes) {
           if (s.getFuelСonsumption() < 50 && s.getFuelСonsumption() > 30)
               System.out.println(s);
        }
    }




}

