package arrayListAndLinkedList.practice;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an ArrayList to store below data
        -15
        -7
        0
        0
        23
        0
        43
        56

        Then print the ArrayList with message List is =
        And print the size of the ArrayList with message Size of the list is =
        Find and print first element with message First element is =
        Find and print last element with message Last element is =

        EXPECTED RESULT
        List is = [-15, -7, 0, 0 , 23, 0, 43, 56]
        Size of the list is = 8
        First element is = -15
        Last element is = 56
         */

        System.out.println("\n---TASK-1---\n");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(-15);
        numbers.add(-7);
        numbers.add(0);
        numbers.add(0);
        numbers.add(23);
        numbers.add(0);
        numbers.add(43);
        numbers.add(56);

        System.out.println("List is = " + numbers);
        System.out.println("Size of the list is = " + numbers.size());
        System.out.println("The first element is = " + numbers.get(0));
        System.out.println("The last element is = " + numbers.get(numbers.size()-1));

        /*
        TASK-2
        Count how many negative numbers are there in the list
        Count how many positive numbers are there in the list
        Count how many zeros are there in the list

        EXPECTED RESULT:
        Positives = 3
        Negatives = 2
        Zeros = 3
         */

        System.out.println("\n---TASK-2-FOR I LOOP---\n");

        int positives = 0, negatives = 0, zeros = 0;

        for (int i = 0; i < 8; i++) {
            if(numbers.get(i) < 0) negatives++;
            else if(numbers.get(i) > 0) positives++;
            else zeros++;
        }

        System.out.println("Positives = " + positives + "\n" +
                "Negatives = " + negatives + "\n" +
                "Zeros = " + zeros);

        System.out.println("\n---TASK-2-FOR EACH LOOP---\n");

        int positives2 = 0, negatives2 = 0, zeros2 = 0;

        for (int number: numbers){
            if(number < 0) negatives2++;
            else if(number > 0) positives2++;
            else zeros2++;
        }

        System.out.println("Positives = " + positives2 + "\n" +
                "Negatives = " + negatives2 + "\n" +
                "Zeros = " + zeros2);

        /*
        TASK-3
        Count how many numbers are there in the list that is bt -10 and 10 (both included)

        EXPECTED RESULT:
        4
         */

        System.out.println("\n---TASK-3---\n");

        int count10To10 = 0;

        for (int number: numbers){
            if(number >= -10 && number <= 10) count10To10++;
        }

        System.out.println(count10To10);

        /*
        TASK-4
        Find sum of all numbers in the list

        EXPECTED RESULT:
        100
         */

        System.out.println("\n---TASK-4---\n");

        int sum = 0;

        for(int number: numbers){
            sum += number;
        }

        System.out.println(sum);


        /*
        TASK-5
        Find sum of last 4 elements in the list

        EXPECTED RESULT:
        122
         */

        System.out.println("\n---TASK-5---\n");

        int sumLastFour = 0;

        for (int i = numbers.size()-4; i < numbers.size(); i++) {
            sumLastFour += numbers.get(i);
        }
        System.out.println(sumLastFour);

         /*
        TASK-6
        Find sum of first 2 and last 2 elements in the list

        EXPECTED RESULT:
        77

        numbers.get(0) + numbers.get(7)
        numbers.get(1) + numbers.get(6)
        numbers.get(2) + numbers.get(5)
         */

        System.out.println("\n---TASK-6---\n");
        int sumOf2 = 0;

        for(int i = 0; i < 3; i++){
            sumOf2 += numbers.get(i) + numbers.get(numbers.size()-1-i);
        }

        System.out.println(sumOf2);


        /*
        TASK-7
        Find sum of first 3 and last 3 elements in the list that are positive only

        EXPECTED RESULT:
        99

        numbers.get(0) + numbers.get(7)
        numbers.get(1) + numbers.get(6)
        numbers.get(2) + numbers.get(5)
         */
        System.out.println("\n---TASK-7---\n");

        int sumOf3 = 0;

        for (int i = 0; i < 3; i++) {
            if(numbers.get(i) > 0) sumOf3 += numbers.get(i);
            if(numbers.get(numbers.size()-1-i) > 0) sumOf3 += numbers.get(numbers.size()-1-i);
        }

        System.out.println(sumOf3);
    }
}
