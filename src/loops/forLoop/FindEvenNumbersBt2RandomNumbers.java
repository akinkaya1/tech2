package loops.forLoop;

import utilities.RandomNumberGenerator;

public class FindEvenNumbersBt2RandomNumbers {
    public static void main(String[] args) {
        /*
        Write a program that generates 2 random numbers bt 10 and 20 (10 and 20 included)
        Find all even numbers bt random numbers, and print them
        Find sum of all odd numbers bt random numbers, and print the sum

        startPoint = Math.max(r1, r2)
        termination point = Math.min(r1, r2)
        update = post-decrement (i--)
         */

        int r1 = RandomNumberGenerator.getRandomNumber(10, 20);
        int r2 = RandomNumberGenerator.getRandomNumber(10, 20);

        System.out.println("First random number is = " + r1);
        System.out.println("Second random number is = " + r2);

        int sumOfOdds = 0;

        for (int i = Math.max(r1, r2); i >= Math.min(r1, r2); i--) {
            if(i % 2 == 0) System.out.println(i);
            else sumOfOdds += i;
        }

        System.out.println("Sum of the odd numbers is = " + sumOfOdds);
        System.out.println("End of the program");
    }
}
