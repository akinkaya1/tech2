package casting;

public class CharCastingExample {
    public static void main(String[] args) {
        /*
        Find sum of decimal representations of 'A', 'X' and '%' in ASCII -> 65, 88, 37 = 190
         */
        char charA = 'A';
        int intA = 'A';
        System.out.println(charA); // A
        System.out.println(intA); // 65

        char charX = 'X';
        int intX = 'X';
        System.out.println(charX); // X
        System.out.println(intX); // 88

        char charPercent = '%';
        int intPercent = '%';
        System.out.println(charPercent); // %
        System.out.println(intPercent); // 37

        System.out.println("Sum of those characters is = " + (intA + intX + intPercent));



    }
}
