package arrays.manipulatingArrayElements;

import java.util.Arrays;

public class ObjectsArray {
    public static void main(String[] args) {
        String[] celebrities = {"Dua Lipa", "Lionel Messi", "Oprah", "Tarkan", "Selena"};

        //Print the length of the array above - 5
        System.out.println("\nThe length of the array = " + celebrities.length);

        //Print the whole array as a String
        System.out.println("\nArray is = " + Arrays.toString(celebrities));

        /*
        TASK-1
        Print each element in separate lines as below
        Element 1 = Dua Lipa
        Element 2 = Lionel Messi
        Element 3 = Oprah
        Element 4 = Tarkan
        Element 5 = Selena
         */

        System.out.println("\n---TASK-1---\n");

        for (int i = 0; i < celebrities.length; i++) {
            System.out.println("Element " + (i+1) + " = " + celebrities[i]);
        }

        /*
        TASK-2
        Print elements that starts with S in separate lines as below
        Result:
        Selena
         */

        System.out.println("\n---TASK-2---\n");

        for(String celebrity: celebrities){
            if(celebrity.toUpperCase().charAt(0) == 'S') System.out.println(celebrity);
        }

        /*
        TASK-3
        Count elements that has l or L
        Result:
        3
         */

        System.out.println("\n---TASK-3---\n");

        int countL = 0;

        for (String celebrity: celebrities) {
            if(celebrity.toLowerCase().contains("l")) countL++;
        }

        System.out.println(countL);

         /*
        TASK-4
        Count elements that has A or a but does not have E or e
        Result:
        3
         */

        System.out.println("\n---TASK-4---\n");

        int countANotE = 0;

        for (String c: celebrities){
            if(c.toUpperCase().contains("A") && !c.toUpperCase().contains("E")) countANotE++;
        }

        System.out.println(countANotE);
    }
}
