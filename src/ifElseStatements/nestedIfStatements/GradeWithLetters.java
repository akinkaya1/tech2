package ifElseStatements.nestedIfStatements;

import java.util.Scanner;

public class GradeWithLetters {
    public static void main(String[] args) {
            /*
    Write a program to ask user to enter their grade for math exam
    And first find if they passed the exam (passing grade is greater or equal to 60)
    if they passed also check which grade they get represented by A, B, C or D
    A -> 90-100
    B -> 80-89
    C -> 70-79
    D -> 60-69
    Failed -> under 60 (for now we skip this)
     */

        var scanner = new Scanner(System.in);
        System.out.println("Please enter you grade:");
        var grade = scanner.nextInt();

        if(grade >= 60){
            System.out.println("You passed this exam!!!");
            if(grade > 100){
                System.out.println("No way!! This cannot be true!!!");
            }
            if(grade >= 90 && grade <= 100){
                System.out.println("You passed with A");
            }
            if(grade >= 80 && grade <= 89){
                System.out.println("You passed with B");
            }
            if(grade >= 70 && grade <= 79){
                System.out.println("You passed with C");
            }
            if(grade >= 60 && grade <= 69){
                System.out.println("You passed with D");
            }
        }

        System.out.println("End of the program!");
    }
}
