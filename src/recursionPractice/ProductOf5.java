package recursionPractice;

public class ProductOf5 {

    /*
    Write a public static recursive method that takes an int n argument
    and returns the product of all numbers starting from 1 to int n

    EXAMPLE:
    if n = 5
    result = 120
     */

    public static int productOfNNumbers(int n){
        if(n == 0) return 1;
        return n * productOfNNumbers(n-1);
    }


    public static void main(String[] args) {
        System.out.println(productOfNNumbers(4));
    }
}
