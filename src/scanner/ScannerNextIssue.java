package scanner;

import java.util.Scanner;

public class ScannerNextIssue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scan.next(); // nextInt(), nextDouble()

        scan.nextLine(); // use this extra line to not get any issues

        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();

        System.out.println("Name is: " + name);
        System.out.println("Sentence is: " + sentence);
        System.out.println("\nEnd of the program");
    }
}
