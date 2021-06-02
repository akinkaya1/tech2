package mathClass;

public class FindMin {
    public static void main(String[] args) {
        /*
        Imagine you are given 2 or more numbers
        And you are asked to find the minimum number (lowest number)
        We can use Math class located in java.lang package
        Ex/ 20, 15
        min = 15
        Ex/ 25, 60, -10
        min = -10
         */

        System.out.println(Math.min(20, 15)); // 15
        System.out.println(Math.min(Math.min(25, 60), -10)); // -10
    }
}
