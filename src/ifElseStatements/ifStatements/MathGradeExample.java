package ifElseStatements.ifStatements;

import scanner.ScannerNextIssue;

import java.util.Scanner;

public class MathGradeExample {
    public static void main(String[] args) {
        /*
        David took a math exam and the passing grade for the exam was 60.

        Write a program that asks David what is his grade.
        If David’s score is greater than or equal to 60,
        then print message “Awesome! So, you have passed this math exam!”.

        PSEUDO CODE
        1. Create a Scanner Object
        2. Ask David to enter his grade and store the answer in proper variable
        3. Check if grade is more than or equal to 60
        4. If grade is more than or equal to 60, then print “Awesome! So, you have passed this math exam!”.
         */

        var scanner = new Scanner(System.in);
        System.out.println("Hey David! What was your grade from math exam?");
        var grade = scanner.nextInt();

        if(grade >= 60){
            System.out.println("Awesome! So, you have passed this math exam!");
        }

        System.out.println("End of the program!");
    }
}
