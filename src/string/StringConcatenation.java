package string;

public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Lionel";
        String lastName = "Messi";

        System.out.println(name); //Lionel
        System.out.println(lastName); // Messi

        // Lionel Messi

        String fullName = name + " " + lastName;
        System.out.println(fullName);
    }
}
