package stringMethods;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        /**
         This method is used to compare two strings, ignoring case considerations
         This method is going to return true if the strings are equal, and false if not, but it is not case sensitive
         So, the return type of this method is boolean
         -it is not a static method
         -it is return type and returns a boolean
         */

        String s1 = "TechGlobal";
        String s2 = "TEcHgLOBal";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
    }
}
