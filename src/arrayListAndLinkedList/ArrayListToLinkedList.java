package arrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("BMW");

        //Convert ArrayList to LinkedList
        LinkedList<String> carsLinkedList = new LinkedList<>(cars);

        carsLinkedList.addAll(cars);// this can also be used to add all elements into the collection

        carsLinkedList.getFirst();
        carsLinkedList.getLast();

        System.out.println(carsLinkedList);
    }
}
