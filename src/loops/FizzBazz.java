package loops;

public class FizzBazz {
    public static void main(String[] args) {
        /*
        Print all numbers starting from 1 to 30 (1 and 30 are included)
        If number is divided by 3, then print "Fizz" instead of number
        if number is divided by 5, then print "Bazz" instead pf number
        if number is divided by both 3 and 5, then print "FizzBazz"

        1
        2
        Fizz
        4
        Bazz
        Fizz
        7
        8
        Fizz
        Bazz
        11
        Fizz
        13
        14
        FizzBazz
        .
        .
        .
        29
        FizzBazz

        start point = 1
        termination point = 30
        update = increment (++)
         */
        System.out.println("\n1st way - for loop\n");
        for (int i = 1; i <= 30; i++){
            if (i % 15 == 0) System.out.println("FizzBazz");
            else if (i % 5 ==0) System.out.println("Bazz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }

        System.out.println("\n2nd way - while loop\n");
        int i = 1;

        while(i <= 30){
            if (i % 15 == 0) System.out.println("FizzBazz");
            else if (i % 5 ==0) System.out.println("Bazz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
            i++;
        }

        System.out.println("End of the program");
    }
}
