package casting;

public class SaveMoneyExample {
    /*
    Assume David is going to save  $390 to buy a bicycle.
    David can save only $15.60 per day.How many days later,
    David can save $390 and buy the bicycle.

    Requirement:
    Write a java program to solve this problem given above

    Expected Output:
    25
     */

    public static void main(String[] args) {
        double save = 390;
        double day = 15.60;
        System.out.println("I can save $" + save + " in " + (int)(save / day) + " days.");
    }
}
