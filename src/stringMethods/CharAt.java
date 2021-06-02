package stringMethods;

public class CharAt {
    public static void main(String[] args) {
        /**
        charAt() method is used to find the character at the specified index (position)
        This method is going to return the character at specified index
        index = position, place
        NOTE: index starts from 0 -> 0,1,2,3,4,5,6…………
        It will throw an exception if given index not found
	    java.lang.StringIndexOutOfBoundsException

         -it is a return type and it returns char
         -it is non-static as we call it with object
         */

        String name = "Salih"; // 0 = S, 1 = a, 2 = l, 3 = i, 4 = h, 100

        char c = name.charAt(2); // l
        char c2 = name.charAt(-5);

        System.out.println(c);
        System.out.println(c2);

    }
}
