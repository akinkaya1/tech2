package ifElseStatements.ifElseStatements;

public class NumberDividedBy3 {
    public static void main(String[] args) {
        /*
        Write a Java program that generates a number bt 0 and 10 (both included)
        Print true if number can be divided by 3
        Print false otherwise

        EX/ 0, 3, 6, 9, 15, 34625421
        number % 3 == 0
         */

        int randomNumber = (int) (Math.random() * 11); // 0-10
        System.out.println("Random number is = " + randomNumber);

        if(randomNumber % 3 != 0){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }

        System.out.println("End of the program!");
    }
}
