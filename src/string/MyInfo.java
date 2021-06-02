package string;

public class MyInfo {
    public static void main(String[] args) {
        /*
        TASK
        Create proper variables to store
        Your name
        Your lastName
        Your age
        Your DOB 09/09/1999
        Your favorite color
        Your favorite number
        Your favorite character
        THEN, print all those variables
        My name is
        My last name is
         */

        String name = "Lionel";
        String lastName = "Messi";
        int age = 30;
        String dateOfBirth = "10/10/1991";
        String favColor = "Black";
        int favNumber = 7;
        char favChar = 'L';

        System.out.println(name + " is my name"); // Lionel is my name
        System.out.println("My last name is " + lastName); // My last name is Messi
        System.out.println("I am " + age + " years old"); // I am 30 years old
        System.out.println("I was born in " + dateOfBirth);
        System.out.println("My fav color is " + favColor);
        System.out.println("My fav number is " + favNumber);
        System.out.println("My fav char is " + favChar);

        System.out.println("My name is " + name + " and my last name is " + lastName + " and my age is " + age);
    }
}
