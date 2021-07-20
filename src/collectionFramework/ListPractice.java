package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {


        /*
        List interface
        LIST (ArrayList/LinkedList) keeps insertion order
        LIST (ArrayList/LinkedList) allows us to have duplicates
        LIST (ArrayList/LinkedList) allows us to have null elements
        LIST (ArrayList/LinkedList) allows us to use all methods with index
        LIST (ArrayList/LinkedList) can be used with fori, foreach and iterator

        ArrayList vs LinkedList
        -LinkedList stores an element with its value, previous element location and next element location
        -ArrayList stores an element with its index
        -Because of the way they are storing data,
        ArrayList allocates less memory while LinkedList allocates more memory
        -Because of the way they are storing data, it is faster when we remove or add elements to LinkedList
        and it is slower when we remove or add elements to ArrayList
        -LinkedList implements all the methods from Deque and Queue (both are interfaces).
        That is why it provides many more methods compared to ArrayList
         */

        List<String> names = new ArrayList<>();
        names.add(null);
        names.add("Yasser");
        names.add("Maryna");
        names.add("Raqi");
        names.add("Maryna");
        names.add("Maryna");
        names.add(null);
        names.add(null);
        names.add(null);

        names.add(3, "Volkan");
        names.set(3, "Sarah");

        System.out.println("My names list = " + names);
        System.out.println("My names list size = " + names.size());
        System.out.println("Element at index of 3 = " + names.get(3));

        //Remove duplicates from above ArrayList -> [null, Yasser, Maryna, Sarah, Raqi]

        System.out.println("\n---Removing duplicates - 1st way---\n");
        List<String> uniqueNames = new ArrayList<>();

        for(String name: names){
            if(!uniqueNames.contains(name)) uniqueNames.add(name);
        }

        System.out.println("My names list after removing duplicates = " + uniqueNames);


        System.out.println("\n---Removing duplicates - 2nd way---\n");
        HashSet<String> uniques = new HashSet<>(names);
        System.out.println("My names list after removing duplicates with Set = " + uniques);

    }
}
