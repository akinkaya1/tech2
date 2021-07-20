package exceptionHandling.uncheckedExceptions;

public class UncheckedExceptionExample2 {
    public static void main(String[] args) {

        String[] objects = {"Table", "Cup", "Mouse", "Monitor", "iMac"};
        System.out.println(objects[2]); // Mouse

        System.out.println(objects[-2]); // this line will throw an ArrayIndexOutOfBoundsException
        System.out.println("End of the program");
    }
}
