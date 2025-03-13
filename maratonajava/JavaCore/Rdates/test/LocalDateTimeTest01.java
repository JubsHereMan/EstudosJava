package Jubs.Project.maratonajava.JavaCore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt= LocalDateTime.now();
        LocalDate date = LocalDate.parse("2018-03-30");
        System.out.println(ldt);
        System.out.println(date);
    }
}
