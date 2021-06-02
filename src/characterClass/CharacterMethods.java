package characterClass;

public class CharacterMethods {
    public static void main(String[] args) {
        char c = 'X';

        boolean isUppercase = Character.isUpperCase(c);
        boolean isLowercase = Character.isLowerCase(c);

        boolean isSpace = Character.isWhitespace(c);
        boolean isLetter = Character.isLetter(c);
        var isDigit = Character.isDigit(c);
        var isDigitOrLetter = Character.isLetterOrDigit(c);

        System.out.println(isUppercase); // true
        System.out.println(isLowercase); // false
        System.out.println(isSpace); // false
        System.out.println(isLetter); // true
        System.out.println(isDigit); // false
        System.out.println(isDigitOrLetter); // true

    }
}
