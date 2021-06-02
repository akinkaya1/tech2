package mathClass;

public class ExerciseMaxMin {
    public static void main(String[] args) {
        /*
        Find the max and min value of given numbers below
        10
        60
        85

        Expected result:
        Min = 10
        Max = 85
         */

        System.out.println("Max = " + Math.max(Math.max(10, 60), 85) +
                            "\nMin = " + Math.min(Math.min(10, 60), 85));
    }
}
