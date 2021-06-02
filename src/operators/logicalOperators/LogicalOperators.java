package operators.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println((5 > 10) && (3 == 3)); // false
        System.out.println((5 != 5) || (2 == 2)); // true

        System.out.println(!false || !true); // true

        System.out.println(true != !false);  // false

        System.out.println(!true != !false && !false == true); // true
    }
}
