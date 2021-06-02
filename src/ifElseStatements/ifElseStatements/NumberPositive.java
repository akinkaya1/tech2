package ifElseStatements.ifElseStatements;

public class NumberPositive {
    public static void main(String[] args) {
        /*
        Write a program that generates a number bt -50 and 50
        And check if number is positive
        if number is positive, print "The number is positive!"
        if number is not positive. print "The number IS NOT positive!"

        PSEUDO
        1.Generate a random number bt -50 and 50
        2.Check if it is positive or not, and print message accordingly

         */

        var randomNumber = (int)(Math.random()*101) - 50; // -50 to 50
        System.out.println("Random number 1 generated is = " + randomNumber);

        if(randomNumber > 0){
            System.out.println("The number is positive!");
        }
        else{
            System.out.println("The number IS NOT positive!");
        }

        System.out.println("End of the program for positive number!\n");

        /*
        Generate a second number
        Write another program that checks if number is negative
        if number is negative, print "The number is negative"
        if number is not negative, then print "The number IS NOT negative"
         */

        var randomNumber2 = (int)(Math.random()*101) - 50; // -50 to 50
        System.out.println("Random number 2 generated is = " + randomNumber2);

        if(randomNumber2 < 0){
            System.out.println("The number is negative!");
        }
        else{
            System.out.println("The number IS NOT negative!");
        }

        System.out.println("End of the program for negative number!");
    }
}
