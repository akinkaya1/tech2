package loops.forLoop;

public class CountCharacters {
    public static void main(String[] args) {
        /*
        Write a Java program to count total number of “o” and "c" letters in the given String below:

	    String str = “TechGlobal School”;

        Expected output:
        3

        Go through each character and check if it is given character.
        And,  if it matching expected character , then count.
         */
        String str = "TechGlobal School";

        int countO = 0;
        int countC = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'o') countO++;
            else if(str.toLowerCase().charAt(i) == 'c') countC++;
        }

        System.out.println("Count of o letters = " + countO);
        System.out.println("Count of c letters = " + countC);

        System.out.println("End of the program");
    }
}
