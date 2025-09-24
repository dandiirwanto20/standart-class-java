package learn.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        // define Date (deprecated)
        Date tanggal = new Date();

        System.out.println(tanggal);

        // define Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        Date result = calendar.getTime();
        System.out.println(result);
    }
}
