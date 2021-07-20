package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapNullPractice {
    public static void main(String[] args) {
        Map<Integer, String> favoriteFruits = new Hashtable<>();
        favoriteFruits.put(1, "Banana");
        favoriteFruits.put(2, "Strawberry");
        favoriteFruits.put(3, "Mango");
        favoriteFruits.put(5, null);


        System.out.println(favoriteFruits);
        System.out.println(favoriteFruits.size());
    }
}
