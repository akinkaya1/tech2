package arrayListAndLinkedList;

import java.util.ArrayList;

public class CitiesArrayList {
    public static void main(String[] args) {

        //1. Create an ArrayList of cities
        ArrayList<String> cities; // declare
        cities = new ArrayList<>(); // initializing


        /**
        Add below elements to declared list
        Chicago
        Berlin
        Madrid
        Kiev
         */

        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Kiev");

        //add Brugge between Berlin and Madrid
        cities.add(2, "Brugge");

        //Print cities list with message Cities list =
        System.out.println("Cities list is = " + cities);

        //Print size with message Size of the cities list is =
        System.out.println("Size of the city is = " + cities.size());

        //Update Madrid to be Barcelona
        cities.set(3, "Barcelona");

        //Update Kiev to be Lviv
        cities.set(4, "Lviv");

        System.out.println("Cities list after updates is = " + cities);

        //add an element to the index of 10
        cities.add(5, "Istanbul");

        System.out.println("Cities list after Istanbul added = " + cities);
        //System.out.println(cities.get(8)); // IndexOutOfBoundException
    }
}
