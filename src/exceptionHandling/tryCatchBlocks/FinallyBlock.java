package exceptionHandling.tryCatchBlocks;

public class FinallyBlock {
    public static void main(String[] args) {

        try{
            String s = "TechGlobal";

            System.out.println(s.charAt(15)); // throws an exception
        }
        catch (Exception e){
            System.out.println("Error!!! " + e.getMessage());
        }
        finally {
            System.out.println("This is my last code of block");
        }
    }
}
