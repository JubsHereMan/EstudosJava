package Jubs.Project.maratonajava.JavaCore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime Now=LocalDateTime.now();
        LocalDateTime nowAfterTwoYears=LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow= LocalTime.now();
        LocalTime timeMinus7Hours= LocalTime.now().minusHours(7);
        LocalTime timeNowAfterTwoYears=LocalTime.now().minusSeconds(2);
        Duration duration = Duration.between(Now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeMinus7Hours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(duration);
        System.out.println(duration2);
        System.out.println(duration3);
    }
}
