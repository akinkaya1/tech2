package practice;

import java.util.Scanner;

public class Practice01_Scanner {
    public static void main(String[] args) {
        System.out.println("---TASK1---");
        System.out.println("My favorite author is \"Stefan Zweig\"" +
                "\nMy favorite quote is \"All our dreams can come true," +
                "\nif we have the courage to pursue them." +
                "\nIn my free time:" +
                "\n-I \"read books\"," +
                "\n-I \"swim\","+
                "\n-I \"watch movies\".");

        System.out.println("\n---TASK2---");
        /*
        Write a program that asks user below questions
        1 - What is your full name?
        2 - What is your age?
        3 - What are your favorite activities?
        4 - Do you like playing video games? true/false
        5 - What are your favorite colors?
        6 - Do you like Tesla? true/false
        7 - What kind of cars do you like?
        8 - What is your favorite letter?
        9 - Which countries you would like to visit?
        10 - What is the result of 5/2?

        ANSWERS TO QUESTIONS MUST FOLLOW AS BELOW
        1 - John Doe
        2 - 40
        3 - Listening to music, hanging out
        4 - false
        5 -Yellow, green, red, blue
        6 - true
        7 - Mercedes, BMW, Maserati
        8 - T
        9 - Italy, Mexico, Brasilia
        10 - 2.5

        EXPECTED RESULTS OF PROGRAM
        User’s full name is = John Doe
        User’s age is = 40
        User’s hobbies are = Listening to music, hanging out
        Does user like video games = false
        User’s favorite colors are = Yellow, green, red, blue
        Does user like Tesla = true
        User’s favorite cars are = Mercedes, BMW, Maserati
        User’s favorite letter is = T
        User wants to visit countries = Italy, Mexico, Brasilia
        The result of 5/2 = 2.5

        PSEUDO CODE
        1.Create a Scanner object to read data from user
        2.Ask questions and store answers in proper variables with proper Scanner methods
        3.Print your results
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your full name?");
        String userFullName = input.nextLine();

        System.out.println("What is your age?");
        int userAge = input.nextInt();
        input.nextLine();

        System.out.println("What are your favorite activities?");
        String hobbies = input.nextLine();

        System.out.println("Do you like playing video games? true/false ");
        boolean vGames = input.nextBoolean();
        input.nextLine();

        System.out.println("What are your favorite colors? ");
        String fColors = input.nextLine();

        System.out.println("Do you like Tesla? true/false ");
        boolean tesla = input.nextBoolean();
        input.nextLine();

        System.out.println("What kind of cars do you like? ");
        String cars = input.nextLine();

        System.out.println("What is your favorite letter? ");
        String fLetter = input.nextLine();

        System.out.println("Which countries you would like to visit? ");
        String vacation = input.nextLine();

        System.out.println("What is the result of 5/2? ");
        double math = input.nextDouble();

        System.out.println("User's full name is = " + userFullName);
        System.out.println("User's age is = " + userAge);
        System.out.println("User's hobbies are = " + hobbies);
        System.out.println("Does user like video games = " + vGames);
        System.out.println("User's favorite colors are = " + fColors);
        System.out.println("Does user like Tesla = " + tesla);
        System.out.println("User's favorite cars are = " + cars);
        System.out.println("User's favorite letter is = " + fLetter);
        System.out.println("User wants to visit countries = " + vacation);
        System.out.println("The result of 5/2 = " + math);
        System.out.println("\nEnd of the Program");
    }
}
