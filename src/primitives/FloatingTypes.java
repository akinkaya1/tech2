package primitives;

public class FloatingTypes {
    public static void main(String[] args){
        /*
        float and double are used to store floating numbers
        float is 4 bytes
        double is 8 bytes
         */

        double balance = 2000.45;
        float f1 = 23.5F; // we have to explicitly define it is float with "f" letter

        // print those 2 variables
        System.out.println(balance); // 2000.45
        System.out.println(f1); // 23.5

        //these primitives can take non-floating numbers as well
        double d1 = 10; // 10.0
        float f2 = 20; // 20.0

        System.out.println(d1);
        System.out.println(f2);
    }
}
