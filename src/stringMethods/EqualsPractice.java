package stringMethods;

import java.util.Scanner;

public class EqualsPractice {
    public static void main(String[] args) {
        /**
         Write a Java program that asks user to enter 2 strings
         And store answers of user in different Strings
         Finally, check if given 2 strings are equal or not and print messages given below
         Test data 1:
         First entered string = Java is fun
         Second entered string = Hello World

         Expected output 1:
         These strings are not equal

         Test data 2:
         First entered string = Hello
         Second entered string = Hello

         Expected output 2:
         These strings are equal
         */

        var input = new Scanner(System.in);
        System.out.println("Please enter one word");
        var word1 = input.nextLine();

        System.out.println("Please enter another word");
        var word2 = input.nextLine();

        System.out.println("Word 1 is = " + word1);
        System.out.println("Word 2 is = " + word2);

        if(word1.equals(word2)) {
            System.out.println("These words are equal");
        }
        else{
            System.out.println("These words are not equal");
        }

        //if word1 equals to word2, then
    }
}
