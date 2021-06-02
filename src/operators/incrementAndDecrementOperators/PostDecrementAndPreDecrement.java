package operators.incrementAndDecrementOperators;

public class PostDecrementAndPreDecrement {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = number1--; //post-decrement

        System.out.println("Number 1 = " + number1); // 9
        System.out.println("Number 2 = " + number2); // 10


        int num1 = 10;
        int num2 = --num1; // pre-decrement

        System.out.println("Num 1 = " + num1); // 9
        System.out.println("Num 2 = " + num2); // 9
    }
}
