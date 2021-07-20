package arrays.manipulatingArrayElements;

public class FindSecondGreatestInArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 6, 7, 8, 5, 15, 15, 45, 10, -99, 15}; // 5, 5, 6, 7, 8, 10, 15, 15

        int greatest = Integer.MIN_VALUE; // -2.147.483.648

        for(int number: numbers){
            //if(number > greatest) greatest = number;
             greatest = Math.max(number, greatest);
        }

        System.out.println("Greatest number from array is = " + greatest); // 15

        int secondGreatest = Integer.MIN_VALUE; // -2.147.483.648

        for (int number: numbers){
            //if(number != greatest && number > secondGreatest) secondGreatest = number;
             if(number != greatest) secondGreatest = Math.max(number, secondGreatest);
        }

        System.out.println("Second greatest number from array is = " + secondGreatest);
    }
}
