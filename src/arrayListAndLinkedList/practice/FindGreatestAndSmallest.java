package arrayListAndLinkedList.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindGreatestAndSmallest {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a LinkedList that stores below data
        10
        10
        10
        47
        34
        -20
        -10
        0

        Then print the ArrayList with message List is =
        Find and print first element with message First element is =
        Find and print last element with message Last element is =
         */
        System.out.println("\n---TASK-1---\n");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(47);
        numbers.add(47);
        numbers.add(34);
        numbers.add(-20);
        numbers.add(-20);
        numbers.add(-10);
        numbers.add(0);

        System.out.println("List is = " + numbers);
        System.out.println("First element is = " + numbers.getFirst());
        System.out.println("Last element is = " + numbers.getLast());

        /*
        TASK-2
        Find the greatest from the list

        EXPECTED RESULT:
        47
         */
        System.out.println("\n---TASK-2---\n");

        int greatest = Integer.MIN_VALUE;

        for(int number : numbers){
            //greatest = Math.max(number, greatest);
            if(number > greatest) greatest = number;
        }

        System.out.println(greatest);

        /*
        TASK-3
        Find the smallest from the list

        EXPECTED RESULT:
        -20
         */

        System.out.println("\n---TASK-3---\n");

        int smallest = Integer.MAX_VALUE;

        for (int number: numbers) {
            if(number < smallest) smallest = number;
        }

        System.out.println(smallest);

        /*
        TASK-4
        Find the second greatest and second smallest from the list
        And find their absolute difference

        EXPECTED RESULT:
        44
         */

        System.out.println("\n---TASK-4---\n");
        int secondGreatest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int number: numbers){
            if(number != greatest && number > secondGreatest) secondGreatest = number; //finds second greatest
            if(number != smallest && number < secondSmallest) secondSmallest = number;
        }

        System.out.println("Second smallest = " + secondSmallest);
        System.out.println("Second greatest = " + secondGreatest);
        System.out.println("The absolute difference of these = " + Math.abs(secondGreatest-secondSmallest));


        /*
        TASK-5
        Find first and second greatest and first and second smallest using sort by removing duplicates
         */

        System.out.println("\n---TASK-5---\n");

        List<Integer> withoutDuplicates = new LinkedList<>();

        for (int number: numbers){
            if(!withoutDuplicates.contains(number)) withoutDuplicates.add(number);
        }

        System.out.println("Removed duplicates list = " + withoutDuplicates);

        //Sorting an ArrayList or LinkedList
        Collections.sort(withoutDuplicates);
        System.out.println("Sorted list without duplicates = " + withoutDuplicates);

        System.out.println("Greatest is = " + withoutDuplicates.get(withoutDuplicates.size()-1));
        System.out.println("Second greatest is = " + withoutDuplicates.get(withoutDuplicates.size()-2));
        System.out.println("Third greatest is = " + withoutDuplicates.get(withoutDuplicates.size()-3));
        System.out.println("Smallest is = " + withoutDuplicates.get(0));
        System.out.println("Second smallest is = " + withoutDuplicates.get(1));
        System.out.println("Third smallest is = " + withoutDuplicates.get(2));

    }
}
