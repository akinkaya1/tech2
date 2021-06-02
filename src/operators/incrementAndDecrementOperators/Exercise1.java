package operators.incrementAndDecrementOperators;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
        5 * 4 = 20
        5 * 5 = 25
        .
        .
        .
        5 * 10 = 50
         */

        int number = 6;
        int start = 1;

        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
        System.out.println(number + " * " + start + " = " + number * start++);
    }
}
