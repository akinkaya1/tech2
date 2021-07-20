package arrays.manipulatingArrayElements;

public class NumbersArray {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22

        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */

        System.out.println("\n---TASK-1---\n");

        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for(int i: numbers){
            System.out.println(i);
        }

        /*
        TASK-2
        Use the above array and
        Print all elements one by one in ONE LINE (space separator) using FOR I LOOP
        RESULT:
        10 -3 -7 0 0 7 22
         */

        System.out.println("\n---TASK-2---\n");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        /*
        TASK-3
        Use the above array and
        Print all elements that are greater than zero  one by one separate lines using FOR EACH LOOP
        RESULT:
        10
        7
        22
         */

        System.out.println("\n---TASK-3---\n");

        for(int i: numbers){
            if(i > 0) {
                System.out.println(i);
            }
        }

         /*
        TASK-4
        Use the above array and
        count how many zeros you have in the array using FOR EACH LOOP
        RESULT:
        2
         */
        System.out.println("\n---TASK-4---\n");

        int count = 0;
        for(int number: numbers){
            if(number == 0){
                count++;
            }
        }

        System.out.println(count);

        /*
        TASK-5
        Use the above array and
        10, -3, -7, 0, 0, 7, 22
        count how many positive and negative numbers you have in the array using FOR I LOOP
        RESULT:
        Positives = 3
        Negatives = 2
         */
        System.out.println("\n---TASK-5---\n");

        var positives = 0;
        var negatives = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) negatives++;
            else if(numbers[i] > 0) positives++;
        }

        System.out.println("Positives = " + positives);
        System.out.println("Negatives = " + negatives);

        /*
        TASK-6
        Use the above array and
        10, -3, -7, 0, 0, 7, 22
        count how many even and odd numbers you have in the array using FOR EACH LOOP
        RESULT:
        Even numbers = 4
        Odd numbers = 3
         */

        System.out.println("\n---TASK-6---\n");

        var even = 0;
        var odd = 0;

        for (int element: numbers) {
            if(element % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);


        /*
        TASK-7
        Use the above array and
        10, -3, -7, 0, 0, 7, 22
        find sum of all numbers in the array using FOR EACH LOOP

        RESULT:
        29

        PSEUDO CODE
        1.Create a variable to store sum
        2.Loop through each element and add to the sum variable
        3.After your loop, print the result sum
         */

        System.out.println("\n---TASK-7---\n");

        int sum = 0;

        for (int number: numbers){
            sum += number;
        }

        System.out.println(sum);

        /*
        TASK-8
        Use the above array and
        10, -3, -7, 0, 0, 7, 22
        find product of all non-zero numbers in the array using FOR EACH LOOP

        RESULT:
        32340

        PSEUDO CODE
        1.Create a variable to store product
        2.Loop through each element and multiply them and assign to product variable - DO NOT multiply 0
        3.After your loop, print the result product
         */

        System.out.println("\n---TASK-8---\n");

        int product = 1;

        for(int number: numbers){
            if(number != 0) product *= number;
        }

        System.out.println(product);

        /*
        TASK-9
        Use the above array and
        10, -3, -7, 0, 0, 7, 22
        find product of all non-zero numbers in the last 3 elements of the array

        RESULT:
        154
         */

        System.out.println("\n---TASK-9---\n");

        int productOfLast3 = 1;

        for (int i = numbers.length-3; i < numbers.length; i++) {
            if(numbers[i] != 0) productOfLast3 *= numbers[i];
        }

        System.out.println(productOfLast3);

        /*
        TASK-10
        Use the above array and
        10, -3, -7, 0, 0, 7, 22
        find the sum of first 4 elements in the array

        RESULT:
        0
         */

        System.out.println("\n---TASK-10---\n");

        int sum4 = 0;
        for (int i = 0; i < 4; i++) {
               sum4 += numbers[i];
        }

        System.out.println(sum4);
    }
}
