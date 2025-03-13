package Jubs.Project.maratonajava.JavaCore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTestTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2003, Month.APRIL,8,13,40);
        LocalDateTime now= LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(now,aniversario));
        System.out.println(ChronoUnit.WEEKS.between(now,aniversario));
        System.out.println(ChronoUnit.MONTHS.between(now,aniversario));
        System.out.println(ChronoUnit.YEARS.between(now,aniversario));
        System.out.println(ChronoUnit.HOURS.between(now,aniversario));
        System.out.println(ChronoUnit.MINUTES.between(now,aniversario));
        System.out.println(ChronoUnit.SECONDS.between(now,aniversario));


    }
}
