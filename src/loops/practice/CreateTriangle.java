package loops.practice;

public class CreateTriangle {
    public static void main(String[] args) {
        /*
        Write a program that creates below triangle

        *
        * *
        * * *
        * * * *
        * * * * *

         */


        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
