package stringMethods;

public class Replace {
    public static void main(String[] args) {
        /*
        -this method is used to replace a character/characters from given string
         */

        String s = "TechCompany";
        System.out.println(s);

        String sNew = s.replace("Company", "global");
        System.out.println(sNew);

        String sFinal = sNew.replace('g', 'G');
        System.out.println(sFinal);


        System.out.println(sFinal.replace("xyz", "Tech")); //this will not change anything
    }
}
