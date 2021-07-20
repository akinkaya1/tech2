package recursionPractice;

public class FindSumOf5 {

    /*
    Write a recursive method that finds the sum numbers from 1-n
    Both 1 and n are included
    Method must be return type and static
     */

    //non-recursive with fori loop
    public static int sumOf5(){
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }

    //recursive method with argument - sum of numbers from 1 to n
    public static int sumOfNNumbers(int n){
        if(n > 0) {
            return n + sumOfNNumbers(n-1);   // 5 + 4 + 3 + 2 + 1 + 0
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(sumOf5());
        System.out.println(sumOfNNumbers(5));
    }

}
