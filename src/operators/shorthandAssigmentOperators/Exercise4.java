package operators.shorthandAssigmentOperators;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        Imagine that we have Apple Store
        and we have 10 MacBook Pro in the morning

        Write a program that asks employee "How many MacBook Pro did you sell today?"
        Subtract employee's answer from total number of MacBooks that you had in the morning and print result

        EXAMPLE PROGRAM:
        Program: How many MacBook Pro did you sell today?
        Employee: 4

        Program: Then, 6 MacBook Pro left in our store!
                 End of the program
         */
        int numberOfMacs = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Macs did you sell today?");
        int sells = scanner.nextInt();

        numberOfMacs -= sells;

        System.out.println("Then, " + numberOfMacs + " MacBook Pro left in our store!");
        System.out.println("\nEnd of the program");
    }
}
