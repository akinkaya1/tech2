package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindPosNeg {
    public static void main(String[] args) {
        /*
        TASK-1
        Generate a random number bt -10 and 10 and store it in an int
        Find out if generated number is negative or not
        Find out if generated number is positive or not
        Find out if generated number is zero or not
         */

        int random1 = RandomNumberGenerator.getRandomNumber(-10, 10);
        System.out.println("Random number 1 = " + random1);

        System.out.println("Is number positive = " + MathHelper.isPositive(random1));
        System.out.println("Is number negative = " + MathHelper.isNegative(random1));
        System.out.println("Is number zero = " + MathHelper.isZero(random1));

    }
}
