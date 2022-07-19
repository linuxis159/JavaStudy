package chapter_10;

import java.time.LocalDate;
import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        LocalDate now = LocalDate.now();
        LocalDate after = now.plusDays(82);
        System.out.println(after);

    }
}
