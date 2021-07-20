package arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        /*
        Create a char array and store values below
        #
        $
        5
        A
        x
        Y
        Print first and last values
        Print the array (eliminate square brackets)
         */


        char[] chars = {'#', '$', '5', 'A', 'x', 'Y'}; // chars = [#, $, 5, A, x, Y]
        System.out.println(chars[0]);
        System.out.println(chars[chars.length-1]);
        System.out.println(Arrays.toString(chars).substring(1, Arrays.toString(chars).length()-1));
    }
}
