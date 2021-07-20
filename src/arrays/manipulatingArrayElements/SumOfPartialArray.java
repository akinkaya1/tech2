package arrays.manipulatingArrayElements;

public class SumOfPartialArray {
    public static void main(String[] args) {

        double[] balances = {10, 15.5, 10, 20.5, 25, 30, 10};

        /*
        TASK-1
        Find sum of first 5 elements in the given array above

        RESULT:
        81.0
         */

        System.out.println("\n---TASK-1---\n");

        double sumFirst5 = 0;
        int i = 0;

        for (double balance: balances){
            if(i < 5)sumFirst5 += balance;
            i++;
        }

        System.out.println(sumFirst5);


        /*
        Find sum of last 5 elements in the given array above
        10, 15.5, 10, 20.5, 25, 30, 10

        2,3,4,5,6
        RESULT:
        95.5
         */
        System.out.println("\n---TASK-2---\n");

        double sumLast5 = 0;

        for (int j = balances.length-5; j < balances.length; j++) {
            sumLast5 += balances[j];
        }

        System.out.println(sumLast5);

        /*
        Find sum of first 2 and last 2 elements in the given array above
        10, 15.5, 10, 20.5, 25, 30, 10

        0,1 - 5,6
        RESULT:
        65.5

        iteration 1 = balances[0] + balances[6]
        iteration 2 = balances[1] + balances[5]
        iteration 3 = balances[2] + balances[4]
         */
        System.out.println("\n---TASK-3---\n");
        double firstLast2 = 0;

        for (int j = 0; j < 2; j++) {
            firstLast2 += balances[j] + balances[balances.length-1-j];
        }

        System.out.println(firstLast2);
    }
}
