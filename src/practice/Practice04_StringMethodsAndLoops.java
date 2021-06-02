package practice;

import utilities.RandomNumberGenerator;

public class Practice04_StringMethodsAndLoops {
    public static void main(String[] args) {
        System.out.println("\nTASK-1\n");
        /*
        TASK-1
        Assume that you are given a String as below;
        String str = ”SDLC is step by step procedure to create an application”;
        Write a program to find length of given String and the indexes of
        “SDLC” and“application” words

        NOTE: index of a word is equal to index of first char in that word
         */

        String sentence = "SDLC is step by step procedure to create an application";
        System.out.println(sentence.length());
        System.out.println(sentence.indexOf("SDLC"));
        System.out.println(sentence.indexOf("application"));

        System.out.println("\nTASK-2\n");
        /*
        TASK-2
        Write a program that generates 2 random numbers bt 0 and 25 (0 and 25 are included),
        Then print all numbers between 2 random numbers that cannot be divided by 5.
        Test data:
        int randomNumber1 = 5;
        int randomNumber1 = 12;

        Expected output:
        6 - 7 - 8 - 9 - 11 - 12

         */

        //1 - create 2 random numbers bt 0 and 25
        int r1 = RandomNumberGenerator.getRandomNumber(0, 25);
        int r2 = RandomNumberGenerator.getRandomNumber(0, 25);

        System.out.println("Random number 1 = " + r1);
        System.out.println("Random number 2 = " + r2);

        //2 - find min and max values to use in loop as they will be your start and termination points
        //3 - use if condition and print all numbers that are not divided by 5

        String s = "";
        for (int i = Math.min(r1, r2); i <= Math.max(r1, r2) ; i++) {
            if(i % 5 != 0) s += (i + " - ");
        }

        System.out.println(s.substring(0, s.length()-3));

        /*
        TASK-3
        Assume that you are given some Strings as below;
        String str1 = “TechGlobal”;
        String str2 = “Apple”;
        String str3 = “Java”;

        Write a Java program that reverses the given String
        Expected output:
        labolGhceT
        elppA
        avaJ
        NOTE: Write a program that handles any String

        String s = "Java";

        s.charAt(3) +
        s.charAt(2) +
        s.charAt(1) +
        s.charAt(0)

        start point = s.length()-1
        termination point = 0
        decrement --
         */
        System.out.println("\nTASK-3\n");
        String word = "TechGlobal";

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

        /*
        TASK-4
        Assume that you are given some Strings as below,
        and you want to find out if the String is palindrome or not
        What is palindrome: It is a word that is read the same backward as forward

        EX/ kayak, civic, madam
        String str1 = “Kayak”;
        String str2 = “TechGlobal”;
        String str3 = “Civic”;

        Expected output:
        “Kayak” word is palindrome
        “TechGlobal” word is not palindrome
        “Civic” word is palindrome
        NOTE: Write a program that handles any String and be careful about upper and lower cases.
         */

        System.out.println("\nTASK-4\n");
        String str = "bab bab";

        String strReversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strReversed += str.charAt(i);
        }

        System.out.println("String reversed is = " + strReversed);

        if(str.equalsIgnoreCase(strReversed)){
            System.out.println(str + " is palindrome!");
        }
        else{
            System.out.println(str + " is not palindrome!");
        }
    }
}
