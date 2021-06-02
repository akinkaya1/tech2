package utilities;

public class MathHelper {
    //method that takes 2 ints and returns their sum -> findSum
    public static int findSum(int number1, int number2){
        return number1 + number2;
    }

    //method that takes 2 ints and prints their sum ->
    public static void printSum(int number1, int number2){
        System.out.println(number1 + number2);
    }

    //method that takes 2 doubles and returns their sum -> findSum
    public static double findSum(double number1, double number2){
        return number1 + number2;
    }

    //method that takes 2 ints and returns remainder of int1 by int2 -> findRemainder
    public static int findRemainder(int number1, int number2) {
        return number1 % number2;
    }

    /**
     method that takes 1 int number and
     returns true if number is even,
     returns false if number is odd -> isEven
     */

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static boolean isOdd(int number){
        return number % 2 != 0;
    }

    //method that takes 2 ints and prints their absolute difference -> printAbsDifference
    public static void printAbsDifference(int number1, int number2){
        System.out.println(Math.abs(number1 - number2));
    }

    //method that takes 2 ints and prints their difference -> printDifference
    public static void printDifference(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    //method that takes 2 ints and returns their absolute difference -> findAbsDifference
    public static int findAbsDifference(int number1, int number2) {
        return Math.abs(number1 - number2);
    }

    //method that takes 2 ints and returns their difference -> findDifference
    public static int findDifference(int number1, int number2) {
        return number1 - number2;
    }

    //method that takes an int and returns true if number is positive -> isPositive
    public static boolean isPositive(int number){
        return number > 0;
    }

    //method that takes a double and returns true if number is positive -> isPositive
    public static boolean isPositive(double number){
        return number > 0;
    }

    //method that takes an int and returns true if number is negative -> isNegative
    public static boolean isNegative(int number){
        return number < 0;
    }

    //method that takes a double and returns true if number is negative -> isNegative
    public static boolean isNegative(double number){
        return number < 0;
    }

    //method that takes an int and returns true if number is zero -> isZero
    public static boolean isZero(int number){
        return number == 0;
    }

    //method that takes a double and returns true if number is zero -> isZero
    public static boolean isZero(double number){
        return number == 0;
    }
}
