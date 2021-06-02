package stringMethods;

public class Concat {
    public static void main(String[] args) {
        /**
        This method is used to add a string to the end of another string (concatenation)
        There are 2 ways to do concatenation
        1. we can use plus + operator
        2. we can use concat method

        -concat() is a non-static method
        -it is a return type and it returns a String
         */

        String s1 = "Tech";
        String s2 = "Global";
        String s3 = s1.concat(s2);

        System.out.println(s3); // TechGlobal
    }
}
