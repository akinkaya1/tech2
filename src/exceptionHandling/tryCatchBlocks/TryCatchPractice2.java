package exceptionHandling.tryCatchBlocks;

public class TryCatchPractice2 {
    public static void main(String[] args) {

        /*
        Create an int variable that stores 10
        Then try to divide the number by 0
        Catch any error might occur and print the message of error
         */

        int num = 10;

        try {
            System.out.println(num / 0);
        }
        catch (Exception e){
            System.out.println("ERROR!!! = " + e.getMessage());
        }
    }
}
