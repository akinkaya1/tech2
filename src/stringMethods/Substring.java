package stringMethods;

public class Substring {
    public static void main(String[] args) {
        /*
        -We will learn 2 overloaded substring methods
        -they are used to extract the characters from a string
        -they are return types and returning strings
        -they are non-static methods
        -if given indexes are not found, then they will throw StringIndexOutOfBoundException
         */

        String s = "TechGlobal";

        String s1 = s.substring(4); // Global
        String s2 = s.substring(7); // bal
        String s3 = s.substring(0, 4); // Tech 0 1 2 3

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String city = "Chicago"; // ica 2 3 4
        String ica = city.substring(2, 5);

        System.out.println(ica);

    }
}
