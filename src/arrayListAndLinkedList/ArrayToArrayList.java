package arrayListAndLinkedList;

import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a LinkedList that stores data below
        23
        45
        65
        78
        23
        56
        20

        -Then, print the entire list
         */

        System.out.println("\n---TASK-1-1st way---\n");

        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(23);
        numbers1.add(45);
        numbers1.add(65);
        numbers1.add(78);
        numbers1.add(23);
        numbers1.add(56);
        numbers1.add(20);
        System.out.println(numbers1);

////////////////////////////////////////////////////////////////////////////////////////
/////////////////////   TASK-1 2nd way   ///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n---TASK-1-2nd way---\n");

        Integer[] numbersArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        LinkedList<Integer> numbers2 = new LinkedList<>(Arrays.asList(numbersArray));
        System.out.println(numbers2);

////////////////////////////////////////////////////////////////////////////////////////
/////////////////////   TASK-1 3rd way   ///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n---TASK-1-3rd way---\n");
        //Sarah, Raqi, Salih, Yasser, Volkan, Maryna

        String[] names = {"Sarah", "Raqi", "Salih", "Yasser", "Volkan", "Maryna"};

        ArrayList<String> namesList =  new ArrayList<>();

        for(String name: names){
            namesList.add(name);
        }

        System.out.println(namesList);


////////////////////////////////////////////////////////////////////////////////////////
// ///////////////////   TASK-1 4th way   //////////////////////////////////////////////
// //////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n---TASK-1-4th way---\n");

        String[] objects = {"Desk", "Chair", "Sofa", "TV", "Table", "Frame"};

        List<String> objectsList = new ArrayList<>();
        Collections.addAll(objectsList, objects);

        System.out.println(objectsList);
    }
}
