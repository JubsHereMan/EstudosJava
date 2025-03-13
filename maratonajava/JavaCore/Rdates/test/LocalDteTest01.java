package Jubs.Project.maratonajava.JavaCore.Rdates.test;

import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class LocalDteTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date= LocalDate.of(2003, Month.APRIL,8);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
    }
}
