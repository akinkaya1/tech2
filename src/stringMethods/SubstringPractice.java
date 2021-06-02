package stringMethods;

public class SubstringPractice {
    public static void main(String[] args) {
        /**
        Assume you are given below sentence “The best is Java”
        Write a Java program that extracts “Java” and "best" from the given sentence
        And store extracted values different strings
        Finally, print these values
         */

        String s = "The best is Java";

        String best = s.substring(4, 8); // best
        String java = s.substring(12); // Java

        System.out.println(best);
        System.out.println(java);
        System.out.println(best.length());
        System.out.println(java.length());

    }
}
