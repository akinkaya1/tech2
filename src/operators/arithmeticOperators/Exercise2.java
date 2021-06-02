package operators.arithmeticOperators;

public class Exercise2 {
    public static void main(String[] args) {
        int sideA = 5;
        int sideB = 6;

        //find the area and perimeter of the rectangle which has sideA and sideB
        int areaOfTheRectangle = sideA * sideB;
        int perimeterOfTheRectangle = 2 * (sideA + sideB);

        System.out.println("The area of the rectangle is = " + areaOfTheRectangle); // 30
        System.out.println("The perimeter of the rectangle is = " + perimeterOfTheRectangle); // 22

    }
}
