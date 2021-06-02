package ifElseStatements.switchStatements;

public class WorkCode {
    public static void main(String[] args) {

        int dayOfWeek = 10;

        switch (dayOfWeek){
            case 1:
                System.out.println("Today is Monday and I wear black");
                break;
            case 2:
                System.out.println("Today is Tuesday and I wear red");
                break;
            case 3:
                System.out.println("Today is Wednesday and I wear green");
                break;
            case 4:
                System.out.println("Today is Thursday and I wear blue");
                break;
            case 5:
                System.out.println("Today is Friday and I wear yellow");
                break;
            default:
                System.out.println("It is weekend or holiday and it is free!!!");
        }

        System.out.println("End of the program!");
    }
}
