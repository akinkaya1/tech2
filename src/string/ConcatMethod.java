package string;

public class ConcatMethod {
    public static void main(String[] args) {
        String str1 = "Tech";
        String str2 = "Global";
        String str3 = str1.concat(str2); // TechGlobal

        System.out.println("Concatenation without method " + str1 + str2); // TechGlobal
        System.out.println("Concatenation with method " + str3); // TechGlobal
    }
}
