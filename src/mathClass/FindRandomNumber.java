package mathClass;

public class FindRandomNumber {
    public static void main(String[] args) {
        /*
        Math.random() -> this method always returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
	    Ex -> Math.random(); // any random number between 0.0 and 1.0

	    We will use this to get random numbers or generate random numbers
         */
        System.out.println(Math.random());

        //Generate random bt 0 to 10
        int random = (int) (Math.random() * 11);
        System.out.println("Random number is = " + random);

        //Generate random bt 0 to 100
        int randomOf100 = (int) (Math.random() * 101);
        System.out.println("Random number is = " + randomOf100);
    }
}
