package operators.arithmeticOperators;

public class Exercise4 {
    public static void main(String[] args) {
        /**
        An annual average salary for an SDET in the Unites States is 90k.
        Write a Java program that calculates and
        prints the monthly and bi-weekly and weekly average amount
        that an SDETs makes in the United States.

        NOTE: Write the pseudo code first
        Annual average salary = $90,000.00
        1 year = 12 months
        1 year = 52 weeks
        Biweekly = every other week

         PSEUDO CODE
         1.Create proper variables to store given information
         2.Calculate monthly and bi-weekly and weekly average amount
         3.Print monthly and bi-weekly and weekly average amounts with proper messages

         EXPECTED RESULTS
         Monthly -> $7,500
         Weekly -> $1730.7692307692307
         Biweekly -> $3461.5384615384614
         */

        double averageSalary = 90_000;
        int months = 12;
        int weeks = 52;

        System.out.println("Monthly payment will be $" + averageSalary / months);
        System.out.println("Weekly payment will be $" + averageSalary / weeks);
        System.out.println("Bi-Weekly payment will be $" + averageSalary / (weeks / 2));

    }
}
