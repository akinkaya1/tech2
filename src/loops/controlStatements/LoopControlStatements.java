package loops.controlStatements;

public class LoopControlStatements {
    public static void main(String[] args) {
        /*
        Write a program that prints all the number bt 1 to 25
        but skip numbers that can be divided by 10 , 7
        also do not print any number more than 15
         */

        for (int i = 1; i <= 25; i++) {
            if(i > 15) break;
            else if(i % 10 == 0 || i % 7 == 0) continue; // skip iteration
            else System.out.println(i);

        }

        System.out.println("End of the program");
    }
}
