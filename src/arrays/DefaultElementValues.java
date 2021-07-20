package arrays;

import java.util.Arrays;

public class DefaultElementValues {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[4] = "Sarah";
        System.out.println(Arrays.toString(strings));

        int[] numbers = new int[5]; // byte, short, long
        numbers[1] = 25;
        numbers[4] = 30;
        numbers[3] = 35;
        System.out.println(Arrays.toString(numbers));

        double[] balances = new double[5]; // float
        System.out.println(Arrays.toString(balances));

        boolean[] booleans = new boolean[5];
        System.out.println(Arrays.toString(booleans));

        char[] chars = new char[5];
        System.out.println(Arrays.toString(chars));
    }
}
