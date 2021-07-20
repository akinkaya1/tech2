package arrayListAndLinkedList.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a companies LinkedList and store data below
        apple
        Microsoft
        Amazon
        Tesla
        Samsung
        Facebook
        Google

        -Print element at 3rd index
        -Print element at 5th index
        -Print the entire list

        Expected result:
        Tesla
        Facebook
        [apple, Microsoft, Amazon, Tesla, Samsung, Facebook, Google]
         */

        System.out.println("\n---TASK-1---\n");
        List<String> companies= new LinkedList<>();
        companies.add("apple");
        companies.add("Microsoft");
        companies.add("Amazon");
        companies.add("Tesla");
        companies.add("Samsung");
        companies.add("Facebook");
        companies.add("Google");
        System.out.println(companies.get(3));
        System.out.println(companies.get(5));
        System.out.println("Unsorted list = " + companies);

        /*
        TASK-2
        Sort the list
        And print it again

        Expected Result:
        [Amazon, Facebook, Google, Microsoft, Samsung, Tesla, apple]
         */

        System.out.println("\n---TASK-2---\n");

        Collections.sort(companies);
        System.out.println("Sorted list = " + companies);

        /*
        TASK-3
        Count the companies that has at least 6 characters in their name

        Expected result:
        5
         */
        System.out.println("\n---TASK-3---\n");

        int count6Plus = 0;

        for(String company: companies){
            if(company.length() >= 6) count6Plus++;
        }

        System.out.println(count6Plus);

        /*
        TASK-4
        Count the companies that starts with A ignoring cases

        Expected result:
        2
         */
        System.out.println("\n---TASK-4---\n");

        int countA = 0;
        for(String company: companies){
            if(company.toLowerCase().startsWith("a")) countA++;
        }

        System.out.println(countA);

        /*
        TASK-5
        Count the companies that starts with capital case

        Expected result:
        6
         */
        System.out.println("\n---TASK-5---\n");

        int countUpper = 0;

        for(String company: companies){
            if(Character.isUpperCase(company.charAt(0))) countUpper++;
        }

        System.out.println(countUpper);
    }
}
