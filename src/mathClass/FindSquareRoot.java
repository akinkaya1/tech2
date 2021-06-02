package mathClass;

public class FindSquareRoot {
    public static void main(String[] args) {
        /*
        Ex/
        square root of 64 = 8
        square root of 25 = 5
        square root of 36 = 6

        to find square root of a number, we can use Math.sqrt() method
        this method returns the value as a double
         */

        System.out.println((int)Math.sqrt(81)); // 9

        System.out.println(Math.sqrt(125-4)); // 11.0

        System.out.println(Math.sqrt(175-6)); //13.0

        System.out.println((int)Math.sqrt(750-125)); //25
    }
}
