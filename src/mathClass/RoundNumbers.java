package mathClass;

public class RoundNumbers {
    public static void main(String[] args) {
        /*
        Math.round() method is going to round given floating number to the closest int
        Ex/
        67.9 -> 68
        67.51 -> 68
        67.49 -> 67
         */

        System.out.println(Math.round(67.49)); // 67
        System.out.println(Math.round(67.51)); // 68
        System.out.println(Math.round(67.50)); // 68
        System.out.println(Math.round(5.467)); // 5
        System.out.println(Math.round(100));


    }
}
