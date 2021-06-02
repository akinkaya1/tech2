package operators.shorthandAssigmentOperators;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        /*
        Imagine that we have 13 eggs
        Ask user how many eggs they had in the breakfast
        And print new result
         */

        int totalNumberOfEggs = 13;
        System.out.println("Total number of eggs at the beginning is : " + totalNumberOfEggs);

        Scanner scan = new Scanner(System.in);
        System.out.println("How many eggs did you had this morning?");
        int eggsConsumed = scan.nextInt();

        totalNumberOfEggs -= eggsConsumed;

        System.out.println("Eggs left is : " + totalNumberOfEggs);
        System.out.println("\nEnd of the program");
    }
}
