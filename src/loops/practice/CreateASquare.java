package loops.practice;

public class CreateASquare {
    public static void main(String[] args) {
        /*
        Write a program that creates a square of stars of 5*5
        *  *  *  *  *
        *           *
        *           *
        *           *
        *  *  *  *  *

         */

        for (int i = 1; i <= 5; i++) {
            if(i == 1 || i == 5){
                System.out.println("*  *  *  *  *");
            }
            else{
                System.out.println("*           *");
            }
        }

    }
}
