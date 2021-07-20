package exceptionHandling.uncheckedExceptions;

public class UncheckedExceptionExample3 {
    public static void main(String[] args) {

        int number = 45;

        System.out.println(number / 3); // 15

        System.out.println(number / 0); // this line will throw ArithmeticException

        System.out.println("End of the program");
    }
}
