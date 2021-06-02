package loops.forLoop;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers bt 0 to 10 (0 and 10 are included)

        Expected output:
        0
        2
        4
        6
        8
        10
        startPoint = 0
        terminationPoint = 10
        update = post-increment (i++)
         */

        System.out.println("\nFirst way\n");
        //1st way
        for (int i = 0; i <= 10; i++) { // 11 times
            if(i % 2 == 0) System.out.println(i);
        }

        System.out.println("\nSecond way\n");
        //2nd way
        for (int i = 0; i <= 10; i++) { //6 times
            System.out.println(i); // 0
            i++;
        }

        System.out.println("\nThird way\n");
        //3rd way
        for (int i = 0; i <= 10; i+=2) { //6 times
            System.out.println(i);
        }


    }
}
