package exceptionHandling.customExceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestCustomExceptions {
    public static void main(String[] args) {


        /*
        Ask user to enter their age
        And check age if they are able to get driver licence or not
        Catch any possible error
        And finally send a message to tell them their age
         */

        Permission permission = new Permission();

        System.out.println("\n ---Test checkAge() method ---\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age user!");
        int age = input.nextInt();

        try{

            permission.checkAge(age);
        }
        catch (Exception e){
            System.out.println("Error message = " + e.getMessage());
        }
        finally {
            System.out.println("Your age is = " + age);
        }


        System.out.println("\n ---Test checkIn() method ---\n");

        /*
        Write a program to ask user to enter the day
        Let user know the check in hours
        In case of any error, catch it and print the error
        Finally, print the current date - day
         */

        System.out.println("Please enter the day from 1 to 7");
        int day = input.nextInt();

        try{
            permission.checkIn(day);
        }
        catch (Exception e){
            System.out.println("Exception message = " + e.getMessage());
        }
        finally {
            Date currentDate = new Date();
            System.out.println("Current date = " + currentDate);
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            System.out.println("Current day = " + dayFormat.format(currentDate));
        }
    }
}
