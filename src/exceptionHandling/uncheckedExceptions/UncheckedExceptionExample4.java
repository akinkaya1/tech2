package exceptionHandling.uncheckedExceptions;

import utilities.MathHelper;

import java.util.TreeSet;

public class UncheckedExceptionExample4 {
    public static void main(String[] args) {

        // TreeSet, TreeMap, Hashtable

        TreeSet<String> cities = new TreeSet<>();
        cities.add("Tokyo");
        cities.add("Chicago");
        cities.add("Miami");
        cities.add(null); // this line will throw a NullPointerException

        System.out.println(cities);

        System.out.println("End of the program");
    }
}
