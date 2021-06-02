package practice;

import java.util.Random;
import java.util.Scanner;

public class Practice03_IfElseStatements {
    public static void main(String[] args) {
        /*
        TASK-1
        Write a program that asks user to enter which day of the Month is today.
        If the answer is between 1 and 15 (both included), then print We are in the first half.
        Otherwise, print We are in the second half.
         */

        System.out.println("---TASK-1---\n");
        var scanner = new Scanner(System.in);
        System.out.println("Please enter which day of the Month is today:");

        if(scanner.nextInt() <= 15) System.out.println("We are in the first half.");
        else System.out.println("We are in the second half.");


        /*
        TASK-2
        Write a program that generates a random number between 1 to 15 (1 and 15 are included)
        HOW TO GENERATE NUMBER BT 1 to 15?
        generate numbers from 0 to 14, then add 1 to generated number (1,15)

        •	If number is multiple of 2 and 5, then print Gold Number
        •	If number is only multiple of 5 and not of 2, then print Good Number
        •	If number is only multiple of 2 and not of 5, then print Poor Number
        •	If number is not multiple of both 2 and 5, then print Bad Number
         */

        System.out.println("\n---TASK-2---\n");
        var random = (int)(Math.random() * 15) + 1; // random number bt 1 to 15

        System.out.println("Random number generated for task2 is = " + random);

        if(random % 10 == 0) System.out.println("Gold number");
        else if(random % 5 == 0) System.out.println("Good number");
        else if(random % 2 == 0) System.out.println("Poor number");
        else System.out.println("Bad number");


        /*
        TASK-3
        Generate a random number between 5 and 15 (5 and 15 are included)
        Generate a random number between 15 and 75 (15 and 75 are included)
        Generate a random number between 100 and 1000 (100 and 1000 are included)
        Print numbers generated

        Answer -> How many numbers you have in the given range
        5-15 -> 11
        generate 11 numbers
         */
        System.out.println("\n---TASK-3---\n");
        var random1 = (int)(Math.random() * 11) + 5;   // 0 to 10   5 to 15
        var random2 = (int)(Math.random() * 61) + 15;
        var random3 = (int)(Math.random() * 901) + 100;

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        /*
        TASK-4
        Write a program that generates 2 random numbers
        First number is between 25 to 50
        Second number is between 5 to 10

        If number1 % number2 is more than 5, then print true
        Otherwise, print false
         */
        System.out.println("\n---TASK-4---\n");
        var ran1 = (int)(Math.random() * 26) + 25;
        var ran2 = (int)(Math.random() * 6) + 5;

        System.out.println(ran1 % ran2 > 5);

        /*
        TASK-5
        Write a program that generates 3 random numbers between 0 to 35 (0 and 35 are included)
        Print true if all numbers are even
        Print false otherwise
         */
        System.out.println("\n---TASK-5---\n");
        Random r = new Random();
        int r1 = r.nextInt(36);
        int r2 = r.nextInt(36);
        int r3 = r.nextInt(36);

        System.out.println("Random number 1 = " + r1);
        System.out.println("Random number 2 = " + r2);
        System.out.println("Random number 3 = " + r3);

        System.out.println(r1 % 2 == 0 && r2 % 2 == 0 && r3 % 2 == 0);

        /*
        TASK-6
        Write a program that generates a random number between 20 to 45 (20 and 45 are included)
        HOW TO GENERATE NUMBER BT 20 to 45?

        •	If number is multiple of 3 and 5, then print - The number can be divided both by 3 and 5
        •	If number is only multiple of 5 and not of 3, then print - The number can be divided by 5 but not 3
        •	If number is only multiple of 3 and not of 5, then print- The number can be divided by 3 but not 5
         */

        int r4 = r.nextInt(26) + 20; // 20 to 45

        if(r4 % 15 == 0) System.out.println("The number can be divided both by 3 and 5");
        else if(r4 % 5 == 0) System.out.println("The number can be divided by 5 but not 3");
        else if(r4 % 3 == 0) System.out.println("The number can be divided by 3 but not 5");

    }
}
