package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their age
        And print “It is your time get retired!” if their age is more than or equal to 55!

        NOTE: Write PSEUDO CODE first
        PSEUDO CODE
        1. Create a Scanner Object
        2. Ask user to enter their age and store the answer in proper variable
        3. Check if age is more than or equal to 55
        4. If age is more than or equal to 55, then print “It is your time get retired!”
         */

        var scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        var age = scan.nextInt();

        if(age >= 55){
            System.out.println("It is your time get retired!");
        }

        System.out.println("End of the program!");
    }
}
