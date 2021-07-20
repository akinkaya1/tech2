package arrayListAndLinkedList;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {

        //1. Create an Integer ArrayList that is called numbers
        var numbers = new ArrayList<Integer>();

        /**
        Add elements below to this list
        10
        15
        20
        10
        10
        30
         */

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Numbers list is = " + numbers);

        //find index of 15
        int indexOf15 = numbers.indexOf(15); // 1
        System.out.println("Index of 15 is = " + indexOf15);

        //find index Of 20 and 30
        System.out.println("Index of 20 is = " + numbers.indexOf(20)); // 2
        System.out.println("Index of 30 is = " + numbers.indexOf(30)); // 5

        //find the first and last index of 10
        System.out.println("First index of 10 is = " + numbers.indexOf(10)); // 0 it gives the first matching index
        System.out.println("Last index of 10 is = " + numbers.lastIndexOf(10)); // 4 it gives last matching index


        //Check if numbers list has 100
        boolean has100 = numbers.contains(100);
        System.out.println("Numbers has 100 = " + has100); // false

        //Check if numbers list has 25 and 30
        System.out.println("Numbers has 25 = " + numbers.contains(25)
                        + "\nNumbers has 30 = " + numbers.contains(30));

        //How to remove an element from ArrayList
        System.out.println(numbers.remove((Integer)20)); // this removes 20 and returns true
        System.out.println(numbers.remove(4)); // this removes 30 at index of 4 and returns 30
        numbers.remove((Integer)10); // this removes first found 10 int the list

        System.out.println("Numbers list after removing is = " + numbers);

        //How to remove all elements from ArrayList, 2 ways

        // numbers.clear(); this is first way to remove all

        numbers.removeAll(numbers); // this is second way to remove all

        System.out.println("Numbers list after clear = " + numbers);
    }
}
