package arrays;

import java.util.Arrays;

public class StoreStudents {
    public static void main(String[] args) {
        /*
        Create an array to store all student names 6
        Sarah
        Raqi
        Yasser
        Maryna
        Volkan
        Salih
        then print first and last elements from this array
        and print array it self
         */

        String[] studentNames = {"Sarah", "Raqi", "Yasser", "Maryna", "Volkan", "Salih"};

        System.out.println("First student is = " + studentNames[0]);
        System.out.println("Last student is = " + studentNames[studentNames.length-1]);
        System.out.println("All student list is = " + Arrays.toString(studentNames).substring(1, Arrays.toString(studentNames).length()-1));
    }
}
