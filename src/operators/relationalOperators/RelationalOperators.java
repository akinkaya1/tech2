package operators.relationalOperators;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println(5 < 10);
        System.out.println(5 != 5);

        System.out.println((5 < 10) == (15 > 8));
        System.out.println((5 == 10) == (5 > 14)); // true     false == false

        boolean b1 = 7 != 8; // true
        System.out.println("b1 is = " + b1);

        boolean b2 = (-25 == -25);
        System.out.println("b2 is = " + b2);
        System.out.println((int)'D' > 20);
    }
}
