package exceptionHandling.tryCatchBlocks;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        Write a program that ask user to enter their name
        Get the 1st and 5th characters from the name
        And check if 1st or 5th character is a or A
        if it is print true
        otherwise print false
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Hey, please enter your name");
        String name = input.nextLine();

        try{
            System.out.println(name.toLowerCase().charAt(0) == 'a' || name.toLowerCase().charAt(4) == 'a');
        }
        catch (Exception e){
            System.out.println("Exception message = " + e.getMessage());
        }
        finally {
            System.out.println("The length for the given name is = " + name.length());
        }

    }
}
