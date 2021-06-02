package operators.shorthandAssigmentOperators;

public class ConcatenationVsAddition {
    public static void main(String[] args) {
        String s1 = "25"; // text
        String s2 = "35"; // text

        int i1 = 25; // number
        int i2 = 35; // number

        System.out.println(s1 + s2); // 2535
        System.out.println(i1 + i2); // 60
        System.out.println(s1 + i1); // 2525

        String test = 25 + s1;
        System.out.println(i1 + s1); // 2525


        System.out.println('a' + 'b'); //195
        int numberA = 'a'; // 97
        char charA = 'a';  // a
        char charB = 98; // b

        System.out.println(numberA); // 97
        System.out.println(charA); // a
        System.out.println(charB); // b
    }
}
