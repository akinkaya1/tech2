package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapCapitals {
    /*
    Create a map to store below countries with their capitals
    France - Paris
    England - London
    Italy - Rome
    Spain - Madrid
     */

    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("England", "London");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");

        System.out.println("My country-capital collection is = " + capitals);
        System.out.println(capitals.get("France"));
        System.out.println(capitals.get("England"));

        //Get the size

        System.out.println("The size of the capitals collection is = " + capitals.size());
        System.out.println("The collection contains key Belgium = " + capitals.containsKey("Belgium")); // false
        System.out.println("The collection contains value Porto = " + capitals.containsValue("Porto")); // false
        System.out.println("The collection contains key Italy = " + capitals.containsKey("Italy")); // true

        System.out.println("Removing England = " + capitals.remove("England"));


        capitals.replace("Italy", "Milan");
        System.out.println(capitals);

        capitals.clear();
        System.out.println(capitals.isEmpty()); // true



    }
}
