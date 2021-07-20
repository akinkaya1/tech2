package singleton;

public class Student {

    private static Student student = new Student();

    private Student(){

    }

    public static Student getStudent(){
        return student;
    }
}
