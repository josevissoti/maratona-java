package academy.devdojo.maratonajava.javacore.Rdates.view;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodView01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2Years = LocalDate.now().plusYears(2).plusMonths(3);

        Period period1 = Period.between(now, nowAfter2Years);
        Period period2 = Period.ofYears(4);
        Period period3 = Period.ofMonths(7);
        Period period4 = Period.ofWeeks(56);
        Period period5 = Period.ofDays(89);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(period4.getMonths());

        System.out.println(now.until(now.plusDays(period4.getDays()), ChronoUnit.MONTHS));
    }
}
