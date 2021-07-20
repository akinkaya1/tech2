package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {
    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate);

        // Print whatever is today -> current day
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        System.out.println("Today is: " + dayFormat.format(currentDate));


        // Print date in the format of MM/dd/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Date is: " + dateFormat.format(currentDate));

        // Print date in the format of Thu hh:mm PM
        SimpleDateFormat timeFormat = new SimpleDateFormat("EEE h:mm a");
        System.out.println("Time is: " + timeFormat.format(currentDate));
    }
}
