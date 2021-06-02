package loops.controlStatements;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        Print all the numbers between given 2 integers starting
        from biggest to smallest (given numbers are included)
        HOWEVER, do not print any number less than 10

        PSEUDO CODE
        1.Create a Scanner object
        2.Ask user to enter 2 numbers and store those in proper variables
        3.Find biggest and smallest number
        4.Use those biggest and smallest numbers as your start point and termination point
        5.Create your loop
        6.Define your conditions
        7.Execute code
         */

        var scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for (int i = Math.max(num1, num2); i >= Math.min(num1, num2) ; i--) {
            if(i < 10) {
                break;
            }
            else {
                System.out.println(i);
            }
        }

        System.out.println("End of the program");
    }
}
