package loops.forLoop;

public class PrintNumbersBackward {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers backward starting from 100 to 0 (100 and 0 are included)

        Expected output:
        100
        99
        98
        .
        .
        .
        2
        1
        0
        startPoint = 100
        terminationPoint = 0 (included)
        update = post-decrement (i--)
         */

        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
