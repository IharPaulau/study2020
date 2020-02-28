package airportDemo;

import airportDemo.airTrasports.TypeOfTransport;



public class StartAirportDemo {

    public static void main(String[] args) {


            Airport a= new Airport("Aeroport de Paris-Charles-de-Gaulle");

        a.allplanes.add(a.planesService.buyNewAirplane("Boing708", 270000, 53, TypeOfTransport.PASSANGER));
        a.allplanes.add(a.planesService.buyNewAirplane("Boing708", 250000, 55, TypeOfTransport.PASSANGER));
        a.allplanes.add(a.planesService.buyNewAirplane("Boing709", 300000, 78, TypeOfTransport.PASSANGER));
        a.allplanes.add(a.planesService.buyNewAirplane("Boing607", 200000, 28, TypeOfTransport.CARGO));
        a.allplanes.add(a.planesService.buyNewAirplane("Boing608", 250000, 48, TypeOfTransport.CARGO));
        a.allplanes.add(a.planesService.buyNewAirplane("Boing609", 300000, 60, TypeOfTransport.CARGO));


//        System.out.println("\nвыаести на экран все пассажирские самолеты: " );
        a.print();
        a.sort();
//        System.out.println("\nвсе самолеты отсортированы по дальности полёта:");
        a.print();
//        System.out.println("\nвсе самолеты расход топлива которых от 30 до 50: ");
        a.search();




    }
}
