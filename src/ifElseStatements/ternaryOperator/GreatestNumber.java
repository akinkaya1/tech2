package ifElseStatements.ternaryOperator;

public class GreatestNumber {
    public static void main(String[] args) {
        var a = 5;
        var b = 6;
        var greatest = a < b ? b : a;

        System.out.println("The greatest is " + greatest);
        System.out.println("End of the program");
    }
}
