package loops.whileLoop;

import utilities.RandomNumberGenerator;

public class Random7 {
    /*
    Write a program that keeps generating random numbers bt 1 to 50
    until it generates 7
    count the attempts to get 7
     */

    public static void main(String[] args) {
        int randomNumber = RandomNumberGenerator.getNumberBt1to50();

        int attempt = 1;

        while (randomNumber != 7){
            System.out.println(randomNumber);
            randomNumber = RandomNumberGenerator.getNumberBt1to50();
            attempt++;
        }

        System.out.println("Attempts = " + attempt);
        System.out.println("End of the program");
    }
}
