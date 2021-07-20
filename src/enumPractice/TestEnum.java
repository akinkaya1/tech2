package enumPractice;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.WEDNESDAY);

        /**
         We can use switch case byte, short, int, String, char, enum
         HOW TO USE switch with enum
         Monday  -> School
         Tuesday -> School + Gym
         Wednesday -> School + Shopping
         Thursday -> School + Go out
         Friday -> Party
         Saturday -> School + Movie
         Sunday -> School + Rest
         */

        Days myDay = Days.FRIDAY;

        switch (myDay){
            case MONDAY:
                System.out.println("School + Study");
                break;
            case TUESDAY:
                System.out.println("School + Gym");
                break;
            case WEDNESDAY:
                System.out.println("School + Shopping");
                break;
            case THURSDAY:
                System.out.println("School + Go out");
                break;
            case FRIDAY:
                System.out.println("Party");
                break;
            case SATURDAY:
                System.out.println("School + Movie");
                break;
            case SUNDAY:
                System.out.println("School + Rest");
                break;
            default:
                System.out.println("NO DEFAULT");
        }



        /*
        Write a program that prints wages as below
        hourly -> $20
        daily -> $160
        weekly -> $800
        bi-weekly -> $1600
        monthly -> $3200
        yearly -> $38400
         */

        Constants.Frequencies frequency = Constants.Frequencies.ANNUALLY;

        switch (frequency){
            case HOURLY:
                System.out.println("$20");
                break;
            case DAILY:
                System.out.println("$160");
                break;
            case WEEKLY:
                System.out.println("$800");
                break;
            case BI_WEEKLY:
                System.out.println("$1600");
                break;
            case MONTHLY:
                System.out.println("$3200");
                break;
            case ANNUALLY:
                System.out.println("$38400");
                break;
            default:
                System.out.println("NO DEFAULT");
        }


        System.out.println("\n----Print all Days constants---\n");
        for(Days day: Days.values()){
            System.out.println(day);
        }

        System.out.println("\n----Print all Frequencies constants---\n");
        for(Constants.Frequencies freq: Constants.Frequencies.values()){
            System.out.println(freq);
        }

        System.out.println(Constants.getWage(Constants.Frequencies.ANNUALLY));

    }
}
