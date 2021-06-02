package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class MathGrade {
    public static void main(String[] args) {
        /*
        David took a math exam and the passing grade for the exam was 60.

        Write a program that asks David what is his grade.
        If David’s score is greater than or equal to 60,
        then print message “Awesome! So, you have passed this math exam!”.

        If David’s score is less than 60, then print message “Sorry! You have failed!”.
         */

        var scanner = new Scanner(System.in);
        System.out.println("Hi David! Please enter your grade: ");
        var grade = scanner.nextInt();

        if(grade >= 60){
            System.out.println("Awesome! So, you have passed this math exam!");
        }
        else{
            System.out.println("Sorry! You have failed!");
        }

        System.out.println("End of the program!");
    }
}
