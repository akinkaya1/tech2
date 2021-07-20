package singleton;

public class TestSingleton {
    public static void main(String[] args) {

        Student student1 = Student.getStudent();
        Student student2 = Student.getStudent();
        Student student3 = Student.getStudent();
        Student student4 = Student.getStudent();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

    }
}
