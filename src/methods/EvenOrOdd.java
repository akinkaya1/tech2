package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
        Generate a random number bt 33 and 79
        Find if number is even
        if even print true
        else print false
         */
        int randomNumber = RandomNumberGenerator.getRandomNumber(33, 79);

        System.out.println("The number is = " + randomNumber);

        System.out.println("Even = " + MathHelper.isEven(randomNumber));
    }
}
