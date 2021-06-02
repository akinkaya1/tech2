package loops.controlStatements;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        between 0 to 10 ( 0 and 10 are included)
        Print all the numbers between given 2 integers starting
        from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5
         */

        var input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers bt 0 and 10");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int small = Math.min(n1, n2);
        int big = Math.max(n1, n2);

        for (int i = small; i <= big; i++) {
            if(i == 5){
                continue;
            }
            else{
                System.out.println(i);
            }
        }

        System.out.println("End of the program");
    }
}
