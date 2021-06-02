package operators.incrementAndDecrementOperators;

public class PostIncrement {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = number1++; // 11

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);

        int num1 = 1;

        num1++;
        num1++;

        num1 += 15;

        System.out.println("Num 1 = " + num1); // 18
    }
}
