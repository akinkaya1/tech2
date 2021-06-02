package stringMethods;

public class ToUpperCaseAndToLowerCase {
    public static void main(String[] args) {
        /**
        toLowerCase() method is used to convert a string to lower case letters
        toUpperCase() method is used to convert a string to upper case letters
         -Both methods are no-args methods
         -both are return types, and they return String
         -both of them are non-static methods
         */

        String s1 = "TechGLObal";
        String lower = s1.toLowerCase();
        String upper = s1.toUpperCase();

        System.out.println(lower);
        System.out.println(upper);
    }
}
