package operators.shorthandAssigmentOperators;

public class ShorthandAssignment {
    public static void main(String[] args) {
        int numberOfStudents = 5;

        System.out.println("The number of students at the beginning = " + numberOfStudents);

        //After a while 10 more students will join - > 15 students
        //numberOfStudents = numberOfStudents + 10; // x = x + 5

        numberOfStudents += 10; // 15

        System.out.println("The number of students after 10 more joining = " + numberOfStudents); // 15
    }
}
