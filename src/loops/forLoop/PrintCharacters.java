package loops.forLoop;

public class PrintCharacters {
    public static void main(String[] args) {
        /*
        Write a Java program to print each character of given String in a separate line:
	    String str = “TechGlobal School”;
	    str.charAt(0);
	    str.charAt(1);
	    str.charAt(2);

	    str.charAt(str.length()-1)

        Expected output:
        T
        e
        c
        .
        .
        .
        o
        o
        l

         */
        String str = "TechGlobal";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("End of the program");
    }
}
