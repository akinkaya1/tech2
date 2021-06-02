package ifElseStatements.ifElseIfElseStatements;

public class WorkCode {
    public static void main(String[] args) {
        /*
        Write a program defines what color we will wear for each work day
        Days are coded as below
        1 Monday
        2 Tuesday
        3 Wednesday
        4 Thursday
        5 Friday
         */

        int dayOfWeek = 6;

        if(dayOfWeek == 1){
            System.out.println("Today is Monday and I wear black");
        }
        else if(dayOfWeek == 2){
            System.out.println("Today is Tuesday and I wear red");
        }
        else if(dayOfWeek == 3){
            System.out.println("Today is Wednesday and I wear green");
        }
        else if(dayOfWeek == 4){
            System.out.println("Today is Thursday and I wear blue");
        }
        else if(dayOfWeek == 5){
            System.out.println("Today is Friday and I wear yellow");
        }
        else{
            System.out.println("It is weekend or holiday and it is free!!!");
        }

        System.out.println("End of the program!");
    }
}
