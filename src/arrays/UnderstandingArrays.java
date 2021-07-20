package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        var studentNames = new String[6]; // We need to define the size of the Array

        studentNames[0] = "Yasser";
        studentNames[1] = "Salih";
        studentNames[2] = "Raqi";
        studentNames[3] = "Maryna";
        studentNames[4] = "Sarah";
        studentNames[5] = "Volkan";

        //How to print an Array
        String allNames = Arrays.toString(studentNames);
        System.out.println(allNames);

        System.out.println(studentNames); // This will print the location of Array from memory
    }
}
