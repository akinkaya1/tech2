package stringMethods;

import utilities.MathHelper;

public class ValueOf {
    public static void main(String[] args) {
        /**
        This method is used to convert primitives to String
         -it is static method
         -it is an overloaded method
         -it is a return type method and it returns a String
         */

        int age = 45;
        String sAge = String.valueOf(age);

        System.out.println(age + 10); // 55
        System.out.println(sAge + 10); // 4510

        boolean b = true;
        String sb = String.valueOf(b);

        System.out.println(b);
        System.out.println(sb);
    }
}
