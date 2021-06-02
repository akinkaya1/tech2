package stringMethods;

public class IndexOf {
    public static void main(String[] args) {
        /**
        indexOf() and lastIndexOf() methods are return type and they return an int
        they are non-static
        they are overloaded method and there are 4 of them
         */
        String s = "TechGlobal";

        System.out.println(s.indexOf('T')); // 0
        System.out.println(s.indexOf("Tech")); // 0
        System.out.println(s.indexOf('G')); // 4
        System.out.println(s.indexOf("Global")); // 4
        System.out.println(s.indexOf('j')); // -1
        System.out.println(s.indexOf("abc")); // -1

        System.out.println(s.indexOf('l')); // 5
        System.out.println(s.lastIndexOf('l')); // 9
        System.out.println(s.lastIndexOf("abc")); // -1

    }
}
