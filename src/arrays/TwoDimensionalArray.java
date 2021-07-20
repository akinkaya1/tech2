package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];

        //How to store some data in this array
        numbers[1][1] = 5;
        numbers[2][0] = 13;
        numbers[1][0] = 8;
        numbers[0][1] = 20;
        numbers[2][1] = 21;
        numbers[0][0] = 7;

        System.out.println(Arrays.deepToString(numbers));

        System.out.println(numbers[2][0]); // 13

        /*
        TASK 1
        Create a two dimensional array that holds numbers below
        print 77, 15 and 89 in separate lines from the 2 dimensional array
        12 15 23
        77 23 89

        Indexes
        00 01 02
        10 11 12
         */

        System.out.println("\n---TASK-1---\n");

        int[][] numbers2 = new int[2][3];
        numbers2 [0][0] = 12;
        numbers2 [0][1] = 15;
        numbers2 [0][2] = 23;
        numbers2 [1][0] = 77;
        numbers2 [1][1] = 23;
        numbers2 [1][2] = 89;

        System.out.println(Arrays.deepToString(numbers2));
        System.out.println(numbers2[1][0]);
        System.out.println(numbers2[0][1]);
        System.out.println(numbers2[1][2]);

        /*
        TASK-2
        Create below array
        1 0 1   // [0][1]
        2 2 2
        3 4 4
        3 4 5  // [3][2]

        print entire array -> [[1, 0, 1], [2, 2, 2], [3, 4, 4], [3, 4, 5]]
        print 5 and 0 from this 2 dimensional array
         */
        System.out.println("\n---TASK-2---\n");

        int[][] numbers3 = {{1, 0, 1}, {2, 2, 2}, {3, 4, 4}, {3, 4, 5}};
        System.out.println(Arrays.deepToString(numbers3));
        System.out.println(numbers3[0][1]);
        System.out.println(numbers3[3][2]);

        /*
        TASK-3
        Salih Yasser Volkan
        Raqi  Sarah  Maryna [2][3]

        String[][] names = new String[2][3];
        names[0][0] = "Salih";

        Print the entire array
        Print Raqi and Yasser from there
         */
        System.out.println("\n---TASK-3---\n");

        String[][] names = {{"Salih", "Yasser", "Volkon"}, {"Raqi","Sarah", "Maryna"}};
        System.out.println(Arrays.deepToString(names));
        System.out.println(names[1][0]); // Raqi
        System.out.println(names[0][1]); // Yasser



        /*
        TASK-4

        BMW Tesla
        Mercedes Audi, Volkswagen
        Honda Toyota
        Ford Kia

        Print all the elements one by one in separate lines
        RESULT:
        BMW
        Tesla
        Mercedes
        Audi
        Volkswagen
        Honda
        Toyota
        Ford
        Kia
         */
        System.out.println("\n---TASK-4---\n");

        String[][] cars = {{"BMW", "Tesla"}, {"Mercedes", "Audi", "Volkswagen"}, {"Honda", "Toyota"}, {"Ford", "Kia"}};

        System.out.println("The size of outer is = " + cars.length); // 4

        for (int i = 0; i < cars.length; i++) {
            System.out.println("The size of inner array " + (i+1) + " = " + cars[i].length);
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println("Element " + (j+1) + " is = " + cars[i][j]);
            }
        }

    }
}
