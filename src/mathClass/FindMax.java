package mathClass;

public class FindMax {
    public static void main(String[] args) {
        /*
        Imagine you are given 2 or more numbers
        And you are asked to find the maximum number (greatest number)
        We can use Math class located in java.lang package

        Ex/ 10, 15
        max = 15

        Ex/ 1, -89, 100, 1000
        max = 1000
         */

        int a = 20;
        int b = 15;

        int max = Math.max(a, b);

        System.out.println("Max number between " + a + " and " + b + " is = " + max);

        System.out.println(Math.max(25, 30)); // 30

        System.out.println();

        // to find the max of 4 numbers, we can use Math.max() method inside the another Math.max() method
        System.out.println(Math.max(Math.max(100, 1000), Math.max(1, -89))); // 1000

        // Please find the max of 5, 8, 20
        System.out.println(Math.max(Math.max(5, 8), 20)); // 20
    }
}
