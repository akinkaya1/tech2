package scanner;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their email address and the phone number and age
        Then, print those values
        Write PSEUDO CODE FIRST
        Email: abc@gmail.com
        Phone: (123)-234-1232
        Age: 35 (int)

        PSEUDO CODE
        1.Create a Scanner object
        2.Ask user to enter above information
        3.Store those data in proper variables
        4.Print the information that provided by user
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your email address: ");
        String emailAddress = scan.next();

        System.out.println("Please enter your phone number: ");
        String phoneNumber = scan.next();

        System.out.println("Please enter your age: ");
        String age = scan.next();

        System.out.println("Please enter your balance: "); // 85.34
        double balance = scan.nextDouble();


        System.out.println("Email address: " + emailAddress);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Age is: " + age);
        System.out.println("Balance is: " + balance);
        System.out.println("\nEnd of the program");
    }
}
