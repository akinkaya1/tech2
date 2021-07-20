package arrays;

public class LoopingArrays {
    public static void main(String[] args) {
        int[] ages = {25, 34, 45, 19};

        //Print each age separately
        System.out.println("\nPrinting Array elements with for i loop\n");

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        System.out.println("\n\nPrinting Array elements with for each loop\n");
        for(int age: ages){
            System.out.print(age + " ");
        }
    }
}
