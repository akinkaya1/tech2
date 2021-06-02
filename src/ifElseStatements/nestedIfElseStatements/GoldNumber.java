package ifElseStatements.nestedIfElseStatements;

public class GoldNumber {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
        */
        int randomNumber = (int) (Math.random() * 101) - 50; // -50 50
        System.out.println("Random number is = " + randomNumber);

        int points = 0;

        if(randomNumber > 0){
            points += 10;
            System.out.println("You won 10 points as your number is positive!!!");
            if(randomNumber > 25){
                points += 10;
                System.out.println("You won 10 points as your number is more than 25!!!");
            }
            else{
                System.out.println("If the number was more than 25, you would get 10 extra points");
            }
            if(randomNumber == 7){
                points += 100;
                System.out.println("You won 100 points as your number is 7!!!");
            }
            else{
                System.out.println("If the number was 7, you would get 100 extra points");
            }
        }
        else{
            System.out.println("LOSER!!!");
            if(randomNumber == -7){
                points += 10;
                System.out.println("But, we give 10 points as your number is -7!!!");
            }
            else{
                System.out.println("If the number was -7, you would still get 10 extra points");
            }
        }

        System.out.println("Points we have = " + points);
        System.out.println("End of the program");
    }
}
