package airportDemo.Comporators;

import airportDemo.airTrasports.Aircraft;


import java.util.Comparator;

public class RangeComporator implements Comparator<Aircraft> {


    @Override
    public int compare(Aircraft a1, Aircraft a2) {

        return a2.maximumRange() - a1.maximumRange();
    }


}

