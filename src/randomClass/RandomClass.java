package randomClass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(64); // 0 to 63
        System.out.println(randomNumber);

    }
}
