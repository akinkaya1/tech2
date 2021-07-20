package arrays.manipulatingArrayElements;

public class CountElements {
    public static void main(String[] args) {

        /*
        TASK-1
        Create an int array and store elements 10, 20, 30, 10, 10, 5, 6
        Count how many 10s you have in the array

        RESULT:
        3
         */

        System.out.println("\n---TASK-1---\n");

        int[] numbers = {10, 20, 30, 10, 10, 5, 6};

        int count  = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 10) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("\n---End of TASK-1---\n");



        /*
        TASK-2
        Create a String to store "Foo bar 3 Bar abc xyz foo bar 56"
        Count how many foo you have in this String
        Count how many bar you have in this String

        RESULT:
        2
        3
         */

        System.out.println("\n---TASK-2---\n");

        String s = "Foo bar 3 Bar abc xyz FOO bAR 56";

        String[] myArray = s.split(" ");

        int fooCounter = 0;
        int barCounter = 0;

        for(String element: myArray){
            if(element.equalsIgnoreCase("foo")) fooCounter++;
            else if(element.equalsIgnoreCase("bar")) barCounter++;
        }

        System.out.println(fooCounter);
        System.out.println(barCounter);

        System.out.println("\n---End of TASK-2---\n");


        /*
        TASK-3
        Create a String to store "green BLUE reD red bLUe RED yellow"
        Count how many red you have in this String
        Count how many blue you have in this String

        RESULT:
        Red = 3
        Blue = 2
         */

        System.out.println("\n---TASK-3---\n");

        String colors = "green BLUE reD red bLUe RED yellow";
        String[] colorsArray = colors.split(" ");

        var redCounter = 0;
        var blueCounter = 0;

        for (int i = 0; i < colorsArray.length; i++) {
            if(colorsArray[i].equalsIgnoreCase("red")) redCounter++;
            else if(colorsArray[i].equalsIgnoreCase("blue")) blueCounter++;
        }

        System.out.println("Red = " + redCounter);
        System.out.println("Blue = " + blueCounter);

        System.out.println("\n---End of TASK-3---\n");
    }
}
