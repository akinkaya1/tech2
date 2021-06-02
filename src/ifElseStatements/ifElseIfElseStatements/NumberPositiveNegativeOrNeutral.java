package ifElseStatements.ifElseIfElseStatements;

public class NumberPositiveNegativeOrNeutral {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number bt -5 and 5
        Find if number is positive, or negative or neutral (zero)
        if number is positive, print "The number is positive"
        if number is negative, print "The number is negative"
        if number is neutral, print "The number is zero"
         */

        int number = (int) (Math.random() * 11) - 5;
        System.out.println("The random is = " + number);

        if(number > 0){
            System.out.println("The number is positive");
        }
        else if(number == 0){
            System.out.println("The number is zero");
        }
        else{
            System.out.println("The number is negative");
        }

        System.out.println("The end of the program!");
    }
}
