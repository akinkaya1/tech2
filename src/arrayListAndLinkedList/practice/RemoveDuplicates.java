package arrayListAndLinkedList.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        Create an ArrayList that stores below data
        10
        20
        30
        30
        20
        40
        50
        70

        -Print the list before removing duplicates
        -Remove duplicates from the list
        -Print the list after removing duplicates

        Expected result:
        List before removing duplicates = [10, 20, 30, 30, 20, 40, 50, 70]
        List after removing duplicates = [10, 20, 30, 40, 50, 70]
         */

        Integer[] numbers = {10, 20, 30, 30, 20, 40, 50, 70};

        ArrayList<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList, numbers); // converting array to array list
        System.out.println("Numbers list before removing duplicates: " + numbersList);

        //Remove duplicates
        List<Integer> uniqueElements = new ArrayList<>();

        for(Integer number: numbersList){
            if(!uniqueElements.contains(number)) uniqueElements.add(number);
        }

        System.out.println("Numbers list after removing duplicates: " + uniqueElements);

    }
}
