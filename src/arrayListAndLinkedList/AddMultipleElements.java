package arrayListAndLinkedList;

import java.util.ArrayList;
import java.util.List;

public class AddMultipleElements {
    public static void main(String[] args) {
        /*
        Create an ArrayList japanCars that stores below data
        Toyota
        Honda
        Lexus
        Acura
        Then, print the list
         */

        List<String> japanCars = new ArrayList<>();
        japanCars.add("Toyota");
        japanCars.add("Honda");
        japanCars.add("Lexus");
        japanCars.add("Acura");

        System.out.println("Japan cars = " + japanCars);

        /*
        Create another ArrayList germanCars that stores below data
        BMW
        Mercedes
        Audi
        Volkswagen
        Then, print the list
         */

        List<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Audi");
        germanCars.add("Volkwagen");

        System.out.println("German cars = " + germanCars);

        /*
        Create a new ArrayList to store all cars above
        Also, add Maserati
        Then, print the new list
         */

        List<String> cars = new ArrayList<>();
        cars.addAll(japanCars);
        cars.addAll(germanCars);
        cars.add("Maserati");

        cars.remove("BMW");
        cars.remove(5);
        System.out.println("All cars list = " + cars);

        cars.removeAll(germanCars);
        System.out.println("All cars list after german cars are removed = " + cars);
    }
}
