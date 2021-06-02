package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindAbsoluteDifference {
    public static void main(String[] args) {
        /**
         * TASK-1
        Write a program that generates 2 random numbers bt 1 and 100
        Find their absolute difference
         */
        System.out.println("\n---TASK-1---\n");
        int i1 = RandomNumberGenerator.getNumberBt1to100();
        int i2 = RandomNumberGenerator.getNumberBt1to100();

        System.out.println("First number is = " + i1);
        System.out.println("Second number is = " + i2);

        MathHelper.printAbsDifference(i1, i2);

        /**
        TASK-2
        Generate 2 random numbers bt 1 and 50
        First print both numbers that are generated
        Then find their difference
        And also find their absolute difference
         */
        System.out.println("\n---TASK-2---\n");
        int num1 = RandomNumberGenerator.getNumberBt1to50();
        int num2 = RandomNumberGenerator.getNumberBt1to50();

        System.out.println("First number is = " + num1);
        System.out.println("Second number is = " + num2);

        MathHelper.printDifference(num1, num2);
        MathHelper.printAbsDifference(num1, num2);


        /**
         TASK-3
        Generate 2 random numbers bt 24 and 32
        First print both numbers that are generated
        Then print their difference with below message
        "The difference of numbers is = {difference}"
        And also print their absolute difference with below message
        "The absolute difference of numbers is = {absolute difference}"
         */
        System.out.println("\n---TASK-3---\n");
        int r1 = RandomNumberGenerator.getRandomNumber(24, 32);
        int r2 = RandomNumberGenerator.getRandomNumber(24, 32);

        System.out.println("First number is = " + r1);
        System.out.println("Second number is = " + r2);

        System.out.println("The difference of numbers is = " + MathHelper.findDifference(r1, r2));
        System.out.println("The absolute difference of numbers is = " + MathHelper.findAbsDifference(r1, r2));

    }
}
