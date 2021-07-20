package collectionFramework;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(-5);
        numbers.add(15);


        // -5, 5, 7, 15
        System.out.println("My numbers collection = " + numbers);

        TreeSet<String> myGarage = new TreeSet<>();
        myGarage.add("Tesla");
        myGarage.add("Mustang");
        myGarage.add("Kia");
        myGarage.add("Maserati");

        //Kia, Maserati, Mustang, Tesla

        System.out.println("My garage = " + myGarage);
    }
}
