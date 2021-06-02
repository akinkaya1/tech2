package stringMethods;

public class Contains {
    public static void main(String[] args) {
        /**
        -this method is used to check whether a string contains a sequence of characters or not
        -it is a return type method and returns a boolean
        -it is non-static
        -it takes a String as argument
         */

        String s = "TechGlobal";
        System.out.println(s.contains(" ")); // false
        System.out.println(s.contains("Tech")); // true
        System.out.println(s.contains("G")); // true

    }
}
