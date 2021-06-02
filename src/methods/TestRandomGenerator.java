package methods;

import utilities.RandomNumberGenerator;

public class TestRandomGenerator {
    public static void main(String[] args) {
        /**
        Generate a random number bt 1 to 100 and
        if number is bt 51 to 100,  print "The number is in the second half"
        otherwise, print "The number is in the first half"
         */
        System.out.println("\n---TASK-1---\n");
        int number1 = RandomNumberGenerator.getNumberBt1to100();
        System.out.println("The number we get is = " + number1);

        if(number1 > 50) System.out.println("The number is in the second half");
        else System.out.println("The number is in the first half");

        /**
        Generate a random number bt -50 to 50 and
        if number is negative, print "NEGATIVE"
        if number is positive, print "POSITIVE"
        otherwise print "NEUTRAL"
         */
        System.out.println("\n---TASK-2---\n");
        int number2 = RandomNumberGenerator.getNumberBtNeg50to50();
        System.out.println("The number we get is = " + number2);

        if(number2 > 0) System.out.println("POSITIVE");
        else if(number2 < 0) System.out.println("NEGATIVE");
        else System.out.println("NEUTRAL");


        /*
        Generate a random number bt 13 and 27
        If number is even, print "EVEN"
        otherwise, print "ODD"
         */

        System.out.println("\n---TASK-3---\n");

        int number3 = RandomNumberGenerator.getRandomNumber(13, 27);
        System.out.println(number3);

        if(number3 % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");

        //Ternary operator
        System.out.println(number3 % 2 == 0 ? "EVEN" : "ODD");
    }
}
