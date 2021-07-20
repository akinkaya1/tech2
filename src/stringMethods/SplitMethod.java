package stringMethods;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String shoppingList = "milk egg bread coffee cereal";

        String[] array = shoppingList.split(" ");

        System.out.println(Arrays.toString(array));

        /*
        1. milk
        2. egg
        3. bread
        4. coffee
        5. cereal
         */

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }

    }
}
