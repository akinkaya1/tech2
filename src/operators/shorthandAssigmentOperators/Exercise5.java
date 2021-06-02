package operators.shorthandAssigmentOperators;

public class Exercise5 {
    public static void main(String[] args) {
        /*
        Find the sum of decimal representation of given chars below
        'A'
        'X'
        '%'
         */
        //First way
        int decimalOfA = 'A';
        int decimalOfX = 'X';
        int decimalOfPercentage = '%';

        System.out.println(decimalOfX + decimalOfA + decimalOfPercentage);

        //Second way
        System.out.println('A' + 'X' + '%');

        //Third way
        int sum = 'A' + 'X' + '%';
        System.out.println(sum);

        //Fourth way
        System.out.println((int)'A' + (int)'X' + (int)'%');

    }
}
