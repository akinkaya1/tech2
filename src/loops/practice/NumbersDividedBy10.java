package loops.practice;

public class NumbersDividedBy10 {
    public static void main(String[] args) throws InterruptedException {
        /*
        print numbers that can be divided by 10 bt 1 to 233

        Expected result:
        10 - 20 - 30 - 40 ................. 220 - 230
         */

        String result = "";
        for (int i = 1; i <= 233; i++) {
            if(i % 10 == 0) result += (i + " - ");
        }
        System.out.println(result.substring(0, result.length() - 3));
    }
}
