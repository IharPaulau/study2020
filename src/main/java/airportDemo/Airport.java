package airportDemo;

import airportDemo.Comporators.RangeComporator;
import airportDemo.airTrasports.Aircraft;
import airportDemo.airportService.AirportService;
import airportDemo.airpotImplement.PlanesService;
import java.util.*;
import org.apache.log4j.Logger;


public class Airport {

    private static final Logger log = Logger.getLogger(Airport.class);
    private String name;
    List<Aircraft> allplanes = new ArrayList<>();


    public Airport(String name) {

        this.name = name;
    }


    AirportService planesService = new PlanesService();

    void print() {
        log.info("\n Вывожу на экран все самолётики: ");
        for (Aircraft а : allplanes) {
            System.out.println(а.toString());
        }
    }


    void sort() {
        log.info("\n самолётики отсортированы!");
        Comparator speedComparator = new RangeComporator();
        Collections.sort(allplanes, speedComparator);
    }

    void search() {
        log.info("\n найдён искомый самолётик: ");
        for (Aircraft s : allplanes) {
           if (s.getFuelСonsumption() < 50 && s.getFuelСonsumption() > 30)
               System.out.println(s);
        }
    }




}

