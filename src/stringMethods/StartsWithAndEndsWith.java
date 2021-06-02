package stringMethods;

public class StartsWithAndEndsWith {
    public static void main(String[] args) {
        /**
        -These methods are used to find out if a string starts or ends with another string
        -These are return types and they return boolean
        -They are non-static methods
        -Both taking one arg which is a string
         */

        String s = "TechGlobal";
        boolean b1 = s.startsWith("Tech"); // true
        boolean b2 = s.endsWith("Global"); // true
        boolean b3 = s.startsWith(s); // true
        boolean b4 = s.endsWith(s); // true

        boolean b5 = s.startsWith("abc"); // false
        boolean b6 = s.endsWith("Tech"); // false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
    }
}
