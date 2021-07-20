package enumPractice;

public class Constants {

    public enum Frequencies{
        HOURLY,
        DAILY,
        WEEKLY,
        BI_WEEKLY,
        MONTHLY,
        ANNUALLY
    }

    public static double getWage(Frequencies frequency){
        if(frequency == Frequencies.ANNUALLY){
            return 38400;
        }
        else if(frequency == Frequencies.MONTHLY){
            return 3200;
        }
        return 0;
    }
}
