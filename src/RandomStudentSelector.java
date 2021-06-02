import java.util.Random;

public class RandomStudentSelector {
    public static void main(String[] args) {
        String[] students = {"Maryna", "Salih", "Sarah", "Raqi", "Yasser"};
        Random random = new Random();
        int i1 = random.nextInt(5);
        if(i1 % 2 == 0){
            int i2 = random.nextInt(3);
            System.out.println("Lucky student is: " + students[i2]);
        }
        else{
            int i2 = random.nextInt(3)+2;
            System.out.println("Lucky student is: " + students[i2]);
        }
    }
}
