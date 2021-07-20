package arrayListAndLinkedList.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveA {
    public static void main(String[] args) {
        /*
        Create an ArrayList and store below data
        apple
        Banana
        Grapes
        Cherry
        Lemon
        Orange

        Print the list with message List before removing elements that has a
        Remove elements that has a
        Print the list with message List after removing elements that has a

        EXPECTED RESULT:
        [Cherry, Lemon]
         */

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Grapes");
        fruitsList.add("Cherry");
        fruitsList.add("Lemon");
        fruitsList.add("Orange");
        System.out.println("List before removing elements: " + fruitsList);

        Iterator<String> it = fruitsList.iterator();

        while(it.hasNext()){
            if(it.next().toLowerCase().contains("a")) it.remove();
        }

        System.out.println("List after removing elements: " + fruitsList);

    }
}
