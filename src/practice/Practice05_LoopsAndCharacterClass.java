package practice;

import java.util.Scanner;

public class Practice05_LoopsAndCharacterClass {
    public static void main(String[] args) {
        /*
        TASK- 1
        Requirement:
        Write a program that asks user to enter a number
        If number is less than 100, then ask user to enter another number
        and find sum of entered 2 numbers.
        Keep asking user to enter numbers until the sum of all entered numbers is at least 100.
        If first number entered by user more than or equal to 100,
        print message “This number is already more than 100” and do not ask user to enter
        any other numbers

        NOTE: Use do while loop!!!
        Example program1:
        Program: Please enter a number
        User : 120
        Expected output:End of the program!

        Example program2:
        Program: Please enter a number
        User : 50
        Program: Please enter a number
        User : 75
        Expected output:End of the program!
         */

        System.out.println("\n---TASK-1---\n");
        var scan = new Scanner(System.in);
        int sum = 0;

        do{
            System.out.println("Please enter a number: ");
            int number = scan.nextInt();
            sum += number;
        }
        while(sum < 100);


        System.out.println("End of the program!");

        /*
        Assume that you are given a number and you are asked to find series of Fibonacci numbers
        •What is Fibonacci numbers:
        a series of numbers in which each number is the sum of the two preceding numbers
        •It always starts with 0 and 1
        •EX: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        Test data 1:
        5
        Expected output 1:
        0 – 1 – 1 – 2 – 3
        0 first
        1 second
        sum 1
         */

        System.out.println("\n---TASK-2 Way 1---\n");

        int zero = 0;
        int one = 1;
        String fibonacciSeries = "0 - 1 - ";

        System.out.println("Please enter a number: ");
        int num = scan.nextInt(); // 5

        for (int i = 2; i < num; i++) {
            int next = zero + one;
            fibonacciSeries += next + " - ";
            zero = one;
            one = next;
        }

        System.out.println(fibonacciSeries.substring(0, fibonacciSeries.length()-3));
        System.out.println("End of the program!");


        System.out.println("\n---TASK-2 Way 2---\n");

        int first = 0;
        int second = 1;
        String result = "";

        System.out.println("Please enter a number: ");
        int numFibonacci = scan.nextInt();

        for (int i = 0; i < numFibonacci; i++) {
            result += first + " - ";
            int sumOfFirstAndSecond = first + second;
            first = second;
            second = sumOfFirstAndSecond;
        }

        System.out.println(result.substring(0, result.length()-3));

        /*
        Assume you are given a String as below
        Find how many digits you have in the String
        Find how many letters you have in the String
        Find how many white spaces you have in the String
        Find how many special chars you have in the String

        String str = "SDF G2372 ksjd2 3y42$ %^2.,   ADFG I235782 $#%^";

        Expected result:
        Number of digits = 15
        Number of letters = 14
        Number of white spaces = 9
        Number of special characters = 9
         */

        System.out.println("\n---TASK-3---\n");
        String str = "SDF G2372 ksjd2 3y42$ %^2.,   ADFG I235782 $#%^";

        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int specials = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            if(97 <= c && c <= 122){
                letters++;
            }
            else if(c >= 48 && c <= 57){
                digits++;
            }
            else if(c == ' '){
                spaces++;
            }
            else{
                specials++;
            }
        }

        System.out.println("Number of digits = " + digits+ "\n" +
                "Number of letters = " + letters + "\n" +
                "Number of white spaces = " + spaces + "\n" +
                "Number of special characters = " + specials);
    }
}
