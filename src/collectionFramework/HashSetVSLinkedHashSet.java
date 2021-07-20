package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetVSLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> capitals = new HashSet<>();
        capitals.add("Ankara");
        capitals.add("Moscow");
        capitals.add("Paris");
        capitals.add("Amman");
        capitals.add("Madrid");
        capitals.add(null);

        System.out.println("My capitals collection = " + capitals);

        LinkedHashSet<String> capitalsLinked = new LinkedHashSet<>();
        capitalsLinked.add("Ankara");
        capitalsLinked.add("Moscow");
        capitalsLinked.add("Paris");
        capitalsLinked.add("Amman");
        capitalsLinked.add("Madrid");
        capitalsLinked.add(null);
        System.out.println("My linked capitals collection = " + capitalsLinked);


    }
}
