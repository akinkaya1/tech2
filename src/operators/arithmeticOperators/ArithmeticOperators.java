package operators.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int age = 25; // assignment operator
        System.out.println("Age is : " + age); // Age is : 25

        //Some code
        age = 30; // re-assignment
        System.out.println(age); // 30

        int addition = 3 + 5; // 8
        System.out.println("Sum of 3 and 5 is = " + addition);

        int subtraction = 3 - 5; // -2
        System.out.println("Difference of 3 and 5 is = " + subtraction);

        int multiplication = 3 * 5; // 15
        System.out.println("Multiplication result of 3 and 5 is = " + multiplication);

        int division = 10 / 2; // 5
        System.out.println("Division result of 10 by 2 is = " + division);

        int remainder = 3 % 5;  // 3 = 5*0 + 3
        System.out.println("Remainder of 3 by 5 is = " + remainder);
    }
}
