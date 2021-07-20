package arrays.manipulatingArrayElements;

public class CountChars {
    public static void main(String[] args) {

        /*
        TASK-1
        Count how many l letters you have in the given String below

        RESULT:
        2

        HOW TO SOLVE
        Go through each character and check if it is given character.
        And, if it is matching expected character , then count.
         */

        System.out.println("\n---TASK-1-1st way---\n");

        String word = "TechGlobal"; //

        int countL = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'l') countL++;
        }

        System.out.println(countL);


        System.out.println("\n---TASK-1-2nd way---\n");

        //converting String into a char array

        char[] charArray = word.toCharArray();

        int countL2 = 0;

        for(char c: charArray){
            if(c == 'l') countL2++;
        }

        System.out.println(countL2);


        /*
        TASK-2
        Count how many 5 letters you have in the given String below
        NOTE: Use toCharArray() method and for each loop
        RESULT:
        5

        HOW TO SOLVE
        Go through each character and check if it is given character.
        And, if it is matching expected character , then count.
         */

        System.out.println("\n---TASK-2---\n");
        String numbers = "55 34 5 3 55 67";

        char[] numbersArray = numbers.toCharArray();
        int count5 = 0;

        for(char c: numbersArray){
            if(c == '5') count5++;
        }

        System.out.println(count5);
    }
}
