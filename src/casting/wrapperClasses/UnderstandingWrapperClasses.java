package casting.wrapperClasses;

import java.util.Scanner;

public class UnderstandingWrapperClasses {
    public static void main(String[] args) {
        int age1 = 45;
        Integer age2 = 45;

        System.out.println(age1);
        System.out.println(age2);

        System.out.println(age1 * 2 + 5);
        System.out.println(age2 * 2 + 5);

        String s = age2.toString(); // 45 as text
        String s2 = String.valueOf(age1); // 45

        int i1 = 12;
        int i2 = 34;

        System.out.println(Math.max(i1, i2));
        System.out.println(Integer.max(i1, i2));

        System.out.println("Max value of byte is = " + Byte.MAX_VALUE);
        System.out.println("Min value of byte is = " + Byte.MIN_VALUE);

        System.out.println("Max value of int is = " + Integer.MAX_VALUE);
        System.out.println("Min value of int is = " + Integer.MIN_VALUE);

        int number1 = 45;

        Integer number2 = number1;// int primitive is converted to Integer Wrapper - Autoboxing
        int number3 = number2; // Integer wrapper is converted to int primitive - Unboxing

        Integer integer = 34;
    }
}
