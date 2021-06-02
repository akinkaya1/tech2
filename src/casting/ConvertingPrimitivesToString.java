package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {
        int age = 45;
        boolean b = true;
        double balance = 100.67;

        String s1 = age + ""; // 45 is converted to a String
        String s2 = "" + b; // true is converted to a String "true"
        String s3 = String.valueOf(balance); // 100.67 is converted to a String

        System.out.println(age + 5); // math
        System.out.println(s1 + 5); // concatenation
        System.out.println(b || true); // true
        //System.out.println(s2 || true); // compiler error

        System.out.println(balance + 2); //Math 102.67
        System.out.println(s3 + 2); //Concatenation 100.672
    }
}
