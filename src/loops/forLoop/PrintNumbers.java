package loops.forLoop;

public class PrintNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers from 0 to 10 (0 and 10 are included)
        Expected output:
        0
        1
        2
        .
        .
        .
        8
        9
        10
        startPoint = 0
        terminationPoint = 10
        update = post-increment (adding one)
         */

        for (int i = 0; i <= 10; i++) { // i <= 10 <--> i < 11
            System.out.println(i);
        }

        System.out.println("End of the program");
    }
}
