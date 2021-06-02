package loops.whileLoop;

public class PrintNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers from 1 to 10 (1 and 10 are included)
        NOTE: use while loop

        Expected output:
        1
        2
        .
        .
        .
        8
        9
        10
         */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;

        while(i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("End of the program");
    }
}
