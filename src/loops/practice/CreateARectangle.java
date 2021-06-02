package loops.practice;

public class CreateARectangle {
    /*
        Write a program that creates a rectangle of stars of 5*10
        *  *  *  *  *
        *  *  *  *  *
        *           *
        *           *
        *           *
        *           *
        *           *
        *           *
        *  *  *  *  *
        *  *  *  *  *

         */

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if(i <= 2 || i >= 9){
                System.out.println("*  *  *  *  *");
            }
            else{
                System.out.println("*           *");
            }
        }

        System.out.println("End of the program");
    }
}
