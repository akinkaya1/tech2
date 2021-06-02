package loops.forLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to find sum of numbers from 10 to 15 ( 10 and 15 are included)
        10 + 11 + 12 + 13 + 14 + 15
        Expected output:
        75

        USE LOOP TO FIND SUM OF NUMBERS
        startPoint = 10
        terminationPoint = 15 (included)
        update = increment (i++)
         */

        int sum = 0;

        for (int i = 10; i <= 15; i++) { // 6 times
            sum += i;
        }

        System.out.println(sum);
    }
}
