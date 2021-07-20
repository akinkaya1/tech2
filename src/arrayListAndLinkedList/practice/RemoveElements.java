package arrayListAndLinkedList.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveElements {
    public static void main(String[] args) {
        /*
        TASK1
        Create an ArrayList to store below data
        Cat
        Dog
        Bird
        Fish
        Cat

        Then print the ArrayList
         */
        String[] animals = {"Cat", "Dog", "Dog", "Bird", "Fish", "Cat"};

        ArrayList<String> animalsList = new ArrayList<>(Arrays.asList(animals));
        System.out.println(animalsList);

        /*
        Remove Cat elements and print your ArrayList again

        EXPECTED RESULT:
        [Dog, Bird, Fish]
         */

        System.out.println("\n---Removing-Cat-1st way creating a new list---\n");
        ArrayList<String> animalsWithoutCats = new ArrayList<>(); // empty at this line

        for(String element: animalsList){
            if(!element.equalsIgnoreCase("cat")) animalsWithoutCats.add(element);
        }

        System.out.println("List after removing cats = " + animalsWithoutCats);


        System.out.println("\n---Removing-Dog-2nd way using iterator---\n");

        Iterator<String> myIterator = animalsList.iterator();

        while(myIterator.hasNext()){
            if(myIterator.next().equalsIgnoreCase("dog")) myIterator.remove();
        }

        System.out.println("List after removing dogs = " + animalsList);
    }
}
