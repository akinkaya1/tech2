package characterClass;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        TASK-1
        Write a program that counts spaces for below String
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */
        System.out.println("\n---TASK-1---\n");
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int spaces = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isWhitespace(address.charAt(i))){
                spaces++;
            }
        }

        System.out.println(spaces);

        /*
        TASK-2
        Write a program that counts lowercase characters in below String
        String quote = "Just do it!";

        Expected result:
        7
         */

        System.out.println("\n---TASK-2---\n");
        String quote = "Just do it!";

        int lowerCases = 0;

        for (int i = 0; i < quote.length(); i++) {
            if(Character.isLowerCase(quote.charAt(i))) {
                lowerCases++;
            }
        }

        System.out.println(lowerCases);

        /*
        TASK-3
        Write a program that counts lowercase characters in below String
        String str = "!@$% ^WR GSD FGADIja sdhuqeqr8752 85";

        find how many lowercase, uppercase, spaces, digits and special characters you have in this String
         */

        System.out.println("\n---TASK-3---\n");

        String str = "!@$% ^WR GSD FGADIja sdhuqeqr8752 85";

        int lowerCase1 = 0;
        int upperCase1 = 0;
        int digits1 = 0;
        int spaces1 = 0;
        int specials1 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                lowerCase1++;
            }
            else if (Character.isUpperCase(str.charAt(i))){
                upperCase1++;
            }
            else if (Character.isDigit(str.charAt(i))){
                digits1++;
            }
            else if (Character.isWhitespace(str.charAt(i))){
                spaces1++;
            }
            else{
                specials1++;
            }
        }
        System.out.println("Number of lowercase = " + lowerCase1 + "\n" +
                "Number of uppercase = " + upperCase1 + "\n" +
                "Number of digits = " + digits1 + "\n" +
                "Number of spaces = " + spaces1 + "\n" +
                "Number of special characters = " + specials1);
    }
}
