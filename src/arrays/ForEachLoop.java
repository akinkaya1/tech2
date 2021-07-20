package arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        TASK-1 - USE FOR EACH LOOP
        Store countries below and print each in separate line
        France
        Brasilia
        Argentina
        Italy
        Spain

        Expected result:
        France
        Brasilia
        Argentina
        Italy
        Spain
         */

        String[] countries = {"France", "Brasilia", "Argentina", "Italy", "Spain"};

        for(String country: countries){
            System.out.println(country);
        }

        System.out.println("End of the task 1\n");

        /*
        TASK-2 - USE FOR EACH LOOP
        Use above countries array
        sort array of countries and print countries one by one in the same line with space separator

        Expected result:
        Argentina Brasilia France Italy Spain
         */

        Arrays.sort(countries);
        for(String country: countries){
            System.out.print(country + " ");
        }
        System.out.println("End of the task 2\n");

        /*
        TASK-3
        Create an array of colors and store
        Blue, Red, Green, Yellow, Brown, Orange

        Print colors that has the length of 6 only in separate lines

        RESULT:
        Yellow
        Orange

        PSEUDO CODE:
        1. Create a String array and store given colors (6 colors)
        2. Loop through each element with a for each loop
        3. Define your condition with a if statement (condition is element length to be 6)
        4. Print those that meets condition in separate lines
         */

        String[] colors = {"Blue", "Red", "Green", "Yellow", "Brown", "Orange"};

        for(String color: colors){
            if(color.length() == 6) System.out.println(color);
        }

    }
}
