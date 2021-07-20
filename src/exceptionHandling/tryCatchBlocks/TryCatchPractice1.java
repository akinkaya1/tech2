package exceptionHandling.tryCatchBlocks;

public class TryCatchPractice1 {
    public static void main(String[] args) {

        String address = "Chicago IL";
        int[] numbers = {1, 5, 7};

        try{
            System.out.println(address.charAt(2));
            System.out.println(numbers[5]);
        }
        catch (Exception e){
            System.out.println("Exception message = " + e.getMessage());
        }

        System.out.println("Rest of the program");
    }
}
