package casting;

import java.util.Scanner;

public class VarKeyword {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var  a1 = "Toyota"; 	//-> String
        var  a2 = 45; 			//-> int
        var  a3 = 34.50; 		//-> double
        var  a4 = 'X'; 			//-> char
        var  a5 = false; 		//-> boolean

        System.out.println(a1);
        System.out.println(a5);
    }
}
