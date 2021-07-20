package exceptionHandling.uncheckedExceptions;

public class UncheckedExceptionExample {
    public static void main(String[] args) {

        String name = "Alex";

        char c = name.charAt(10); // this line will throw StringIndexOutOfBoundsException

        System.out.println(c);

        System.out.println("End of the program");

    }
}
