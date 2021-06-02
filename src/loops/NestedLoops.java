package loops;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("New number detected from i loop: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("New number detected from j loop: " + j);
                for (int k = 1; k <= 2; k++) {
                    System.out.println("New number detected from k loop: " + k);
                }
            }
        }

        System.out.println("End of the program");
    }
}
