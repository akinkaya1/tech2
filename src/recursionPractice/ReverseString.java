package recursionPractice;

public class ReverseString {
    //apple    pple a
    // ple p
    // le p
    // e l
    // e
    //
    public static String reverse(String word){
        if(word.length() > 0) return reverse(word.substring(1)) + word.charAt(0);
        return "";
    }

    public static void main(String[] args) {
        System.out.println(reverse("apple"));
    }
}
