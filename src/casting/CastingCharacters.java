package casting;

public class CastingCharacters {
    public static void main(String[] args) {
        char charB = 'b';
        int intB = 'b'; // implicit casting of char to int

        int num = 100;
        char c = (char) num; // explicit casting of int to char
    }
}
