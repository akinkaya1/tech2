package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {
        String numberOfStudents = "23"; // text

        int number1 = Integer.valueOf(numberOfStudents); // 23 - Integer (object)
        int number2 = Integer.parseInt(numberOfStudents); // 23 - int (primitive)

        int numberOfStudentMultipliedWith2 = number2 * 2; // number1 will work as well
        System.out.println(numberOfStudentMultipliedWith2); // 46

        double d1 = Double.valueOf(numberOfStudents); // 23.0 - Double (object)
        double d2 = Double.parseDouble(numberOfStudents); // 23.0 - double (primitive)

        double numberOfStudentsSubtractedBy5 = d1 - 5; // d2 will work as well

        System.out.println(numberOfStudentsSubtractedBy5); // 18.0

        String isJavaFun = "true";

        boolean b1 = Boolean.valueOf(isJavaFun); // true - Boolean - object
        boolean b2 = Boolean.parseBoolean(isJavaFun); // true -boolean - primitive

        System.out.println(b1 && b2); // true
        //System.out.println(isJavaFun || b1); // compiler error
    }
}
