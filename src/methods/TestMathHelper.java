package methods;

import utilities.MathHelper;

public class TestMathHelper {
    public static void main(String[] args) {

        System.out.println(MathHelper.findSum(45, 10)); // findSum() method is return type

        MathHelper.printSum(10, 25); // 35

        System.out.println(MathHelper.findSum(5.5, 6.5)); // 12.0

        System.out.println("Remainder of 4 by 3 is = " + MathHelper.findRemainder(4, 3)); // 1

        System.out.println("True or false = " + MathHelper.isEven(15)); // false
    }
}
