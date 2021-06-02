package operators.arithmeticOperators;

public class Exercise1 {
    public static void main(String[] args) {
        int bigNumber = 6;
        int smallNumber = 4;

        int sum = bigNumber + smallNumber;
        System.out.println("Sum is = " + sum); // 10

        int subtraction = bigNumber - smallNumber;
        System.out.println("Subtraction is = " + subtraction);

        int multiplication = bigNumber * smallNumber;
        System.out.println("Multiplication is = " + multiplication);

        double division = (double)bigNumber / smallNumber;
        System.out.println("Division is = " + division);

        int remainder = bigNumber % smallNumber; //
        System.out.println("Remainder is = " + remainder);

    }
}
