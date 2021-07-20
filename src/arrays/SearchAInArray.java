package arrays;

import java.util.Arrays;

public class SearchAInArray {
    public static void main(String[] args) {
        char[] chars = {'x', 'b', '5', '%', '&'};

        //1st way with for each loop

        boolean check = false;

        for (char c: chars){
            if(c == 'A') {
                check = true;
                break;
            }
        }

        if(check) System.out.println("This array has A");
        else System.out.println("This array does not have A");


        //2nd way with binarySearch() method
        //x, b, 5, %, & -> 0, 1, 2, 3, 4

        Arrays.sort(chars);

        int indexOfA = Arrays.binarySearch(chars, 'A'); //negative

        if(indexOfA < 0) System.out.println("There is no A");
        else System.out.println("There is A");

    }
}
