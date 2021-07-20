package arrayListAndLinkedList;

import java.util.ArrayList;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(3);

        //Adding Strawberry, Banana, Orange
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Orange");

        //Print list
        System.out.println(fruits); // [Strawberry, Banana, Orange]

        fruits.add("Apple"); //4th element

        System.out.println(fruits); // [Strawberry, Banana, Orange, Apple]

        //Add an element in a particular index
        fruits.add(0, "Blueberry");

        System.out.println(fruits); // [Blueberry, Strawberry, Banana, Orange, Apple]

        String s = fruits.get(3); // Orange
        System.out.println(s);

        //Get and print Strawberry from given ArrayList of fruits above
        System.out.println(fruits.get(1)); // Strawberry

        System.out.println(fruits.size()); // 5
    }
}
