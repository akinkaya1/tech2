package collectionFramework;

import java.util.*;

public class MapPracticeKeySetValues {
    public static void main(String[] args) {
        Map<String, String> favorites = new TreeMap<>();
        favorites.put("Day", "Friday");
        favorites.put("City", "San Diego");
        favorites.put("Color", "Red");
        favorites.put("Car", "Mercedes");
        favorites.put("Pet", "Turtle");

        Set<String> myKeys = favorites.keySet();
        System.out.println("All the keys are = " + myKeys);

        Collection<String> myValues = favorites.values();
        System.out.println("All the values are = " + myValues);

        System.out.println(favorites.entrySet());


        for(Map.Entry element: favorites.entrySet()){
            System.out.println("My favorite " + element.getKey() + " is " + element.getValue());
        }

    }
}
