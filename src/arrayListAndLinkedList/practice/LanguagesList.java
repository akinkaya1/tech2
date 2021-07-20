package arrayListAndLinkedList.practice;

import java.util.ArrayList;
import java.util.List;

public class LanguagesList {
    public static void main(String[] args) {
        /**
        TASK-1
        Create a list to store given data below
        Java
        Ruby
        Kotlin
        Python
        JavaScript
        Java
        Ruby

        Then, print list with message The languages list =
        Also, print the size of the list with message The size of the list =
         */

        System.out.println("\n---TASK-1---\n");

        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("Ruby");
        languages.add("Kotlin");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Ruby");
        System.out.println("The language list is = " + languages);
        System.out.println("The size of the list is = " + languages.size());

        /**
        TASK-2
        Print first element from the list with message First element is =
        Print last element from the list with message Last element is =
        Print middle element from the list with message Middle element is =

        Write a dynamic code that will work if new elements are added or
        some elements are removed from the list
        DO NOT HARD CODE

         EXPECTED RESULT:
         First element is = Java
         Middle element is = Python
         Last element is = Ruby
         */

        System.out.println("\n---TASK-2---\n");
        System.out.println("First element is = " + languages.get(0));
        System.out.println("Middle Element of the list: " + languages.get(languages.size()/2));
        System.out.println("Last element is = " + languages.get(languages.size() - 1));


        /**
        TASK-3
        Print each element in separate lines

        EXPECTED RESULT:
        Java
        Ruby
        Kotlin
        Python
        JavaScript
        Java
        Ruby
         */

        System.out.println("\n---TASK-3-For Each Loop---\n");

        for(String language: languages){
            System.out.println(language);
        }

        System.out.println("\n---TASK-3-For i Loop---\n");

        for (int i = 0; i <= languages.size()-1; i++) {
            System.out.println(languages.get(i));
        }

        /**
        TASK-4
        Print only languages that does not start with J

        EXPECTED RESULT:
        Ruby
        Kotlin
        Python
        Ruby
         */

        System.out.println("\n---TASK-4-For Each Loop---\n");

        for(String language: languages){
            if(!language.toUpperCase().startsWith("J")) System.out.println(language);
        }


        System.out.println("\n---TASK-4-For i Loop---\n");

        for (int i = 0; i <= languages.size()-1; i++) {
            if(!languages.get(i).toUpperCase().startsWith("J")) System.out.println(languages.get(i));
        }

        /**
         TASK-5
         Print only languages that has at least length of 5

         EXPECTED RESULT:
         Kotlin
         Python
         JavaScript
         */

        System.out.println("\n---TASK-5-For Each Loop---\n");
        for(String element: languages){
            if(element.length() > 4) System.out.println(element);
        }

        System.out.println("\n---TASK-5-For i Loop---\n");
        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).length() >= 5) System.out.println(languages.get(i));
        }

        /*
         TASK-6
         Print only languages that has character a

         EXPECTED RESULT:
         Java
         JavaScript
         Java
         */

        System.out.println("\n---TASK-6-For Each Loop---\n");
        for(String element: languages){
          if(element.toLowerCase().contains("a")) System.out.println(element);
        }

        System.out.println("\n---TASK-6-For i Loop---\n");
        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).toUpperCase().contains("A")) System.out.println(languages.get(i));
        }

        //Print first 3 element
        //Print last 3 element
    }
}
