package arrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("BMW");

///////////////////////////////////////////////////////////////////////////////////////
// ///////////////////   1st way   ////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n---1st way to convert ArrayList to Array---\n");
        //Convert list to array
        Object[] carsArray1 = cars.toArray();

        //Print the array
        System.out.println(Arrays.toString(carsArray1));


///////////////////////////////////////////////////////////////////////////////////////
// ///////////////////   2nd way   ////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n---2nd way to convert ArrayList to Array---\n");
        String[] carsArray2 = new String[cars.size()];

        for (int i = 0; i < carsArray2.length; i++) {
            carsArray2[i] = cars.get(i);
        }

        System.out.println(Arrays.toString(carsArray2));
    }
}
