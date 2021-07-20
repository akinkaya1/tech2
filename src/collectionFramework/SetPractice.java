package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add(null);
        cities.add("Porto");
        cities.add("Chicago");
        cities.add("Tokyo");
        cities.add("Istanbul");
        cities.add("Erbil");
        cities.add("Gent");
        cities.add("tokyo");
        cities.add("Miami");


        System.out.println(cities);

        /*
        -Set does not keep insertion order (unordered collection of objects)
        -Set does not allow us to have any duplicates
        -Set does not allow us to use any method with index
        -Set allows us to have only one null value (no duplication)
        -Set can be used with foreach and iterator but cannot be used with fori loop (there is no index)
         */
    }
}
