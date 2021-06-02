package characterClass;

public class CountUpperCaseAndLowerCaseLetters {
    public static void main(String[] args) {
        /*
        Write a program to count lowercase letters and uppercase letters
        from given String

        Expected result:
        Uppercase letters =
        Lowercase letters =
         */

        String s = "ASSKAFKJasjdhfksdhg9823";

        int upperCases = 0;
        int lowerCases = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)){
                upperCases++;
            }
            else if (Character.isLowerCase(c)){
                lowerCases++;
            }
        }

        System.out.println("Lower cases  = " + lowerCases);
        System.out.println("Upper cases  = " + upperCases);
    }
}
