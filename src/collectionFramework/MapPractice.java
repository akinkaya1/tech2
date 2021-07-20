package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer, String> members = new HashMap();
        members.put(1, "Volkan");
        members.put(2, "Maryna");
        members.put(3, "Yasser");
        members.put(4, "Raqi");
        members.put(5, "Sarah");
        members.put(6, "Salih");

        System.out.println(members);

        System.out.println(members.get(4)); // Raqi

    }
}
