package Jubs.Project.maratonajava.JavaCore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusMonths(1);
        Period period = Period.between(today ,nextMonth);
        Period p2= Period.ofDays(10);
        Period p3= Period.ofWeeks(58);
        Period p4= Period.ofYears(58);

        System.out.println(period);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
