package stringMethods;

public class Trim {
    public static void main(String[] args) {
        /*
        -it is used to remove whitespaces from both ends of a String
        -it is a return type and it returns a String
        -it is a non-static method
        -it is a non-args method
         */

        String s1 = "   Java is fun     ";
        String s2 = s1.trim();

        System.out.println("String 1 is = " + s1); //    Java is fun
        System.out.println("String 2 is = " + s2); // Java is fun
        System.out.println("String 1 length is = " + s1.length()); // 19
        System.out.println("String 2 length is = " + s2.length()); // 11
    }
}
