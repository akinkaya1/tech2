package loops.whileLoop;

import java.util.Scanner;

public class FindSumOfNumbersByUser {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter how many number you want to find sum");
        int amountOfNumbers = scanner.nextInt(); // 5

        int sum = 0;

        int start = 1;

        while(start <= amountOfNumbers){
            System.out.println("Please enter number " + start);
            int number = scanner.nextInt();
            sum += number;
            start++;
        }

        System.out.println("Sum of entered numbers is = " + sum);
        System.out.println("End of the program");
    }
}
