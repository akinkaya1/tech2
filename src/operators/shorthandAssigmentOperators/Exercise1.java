package operators.shorthandAssigmentOperators;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Create 2 int variables
        int a = 8;  int b = 3;
        Then, find their sum, subtraction, multiplication, division and remainder by
        using shorthand operators, and assign those values into a.
         */

        int number1 = 8, number2 = 3;

        // number1 = number1 + number2;
        number1+=number2;

        System.out.println("Addition of 3 : " + number1);

        // number1 = number1 - number2; // 8
        number1 -= number2;

        System.out.println("Subtraction of 3 : " + number1);

        // number1 = number1 * number2; // 24
        number1 *= number2;

        System.out.println("Multiplication with 3 : " + number1);

        // number1 = number1 / number2; // 8
        number1 /= number2;

        System.out.println("Division with 3 : " + number1);

        // number1 = number1 % number2; // 2
        number1 %= number2;

        System.out.println("Remainder with 3 : " + number1); // 2
    }
}
