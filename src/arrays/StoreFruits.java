package arrays;

import java.util.Arrays;

public class StoreFruits {
    public static void main(String[] args) {
        /*
        Create an array to store fruits below
        Apple
        Orange
        Banana
        Melon
        Grapes

        Then print the array
         */
        String[] fruitNames = new String[5]; // 0 1 2 3 4
        fruitNames[0] = "Apple";
        fruitNames[4] = "Grapes";
        fruitNames[1] = "Orange";
        fruitNames[3] = "Melon";
        fruitNames[2] = "Banana";



        String allNames = Arrays.toString(fruitNames);
        System.out.println(allNames);

        System.out.println(fruitNames);

    }
}
