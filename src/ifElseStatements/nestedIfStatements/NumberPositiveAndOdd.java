package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number bt -50 and 50
        And check if number is positive first
        If number is positive, print "Number is positive"
        then also check if number is odd and print "Number is odd as well"

        NOTE: if number is not positive, then you don't need to check if it is odd

        PSEUDO
        1.Generate a random number bt -50 and 50
        2.Check if it is positive, and print message
        3.If positive, also check if it is odd and print message
         */

        var randomNumber = (int)(Math.random()*101) - 50; // -50 to 50
        System.out.println("Random number generated is = " + randomNumber);

        if(randomNumber > 0){
            System.out.println("The number is positive!");
            if(randomNumber % 2 != 0){
                System.out.println("The number is odd!");
            }
        }

        System.out.println("End of the program!");
    }
}
