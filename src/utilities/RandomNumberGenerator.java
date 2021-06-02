package utilities;

public class RandomNumberGenerator {

    //method that returns a random bt 1 to 10
    public static int getNumberBt1to10(){
        return (int)(Math.random() * 10 + 1);
    }

    //method that returns a random bt 1 to 50
    public static int getNumberBt1to50(){
        return (int)(Math.random() * 50 + 1);
    }

    //method that returns a random bt 1 to 100
    public static int getNumberBt1to100(){
        return (int)(Math.random() * 100 + 1);
    }

    //method that returns a random number bt -50 and 50
    public static int getNumberBtNeg50to50(){
        return (int) (Math.random() * 101 - 50);
    }

    //method that takes 2 int parameters and returns a random number bt those
    public static int getRandomNumber(int startPoint, int endPoint){
        int amount = endPoint - startPoint + 1;
        return (int) (Math.random() * amount) + startPoint;
    }
}
