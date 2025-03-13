package Jubs.Project.maratonajava.JavaCore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LolcalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println(time);
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
    }
}
