package dateandtimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculatePeriod {
    public static void main(String[] args) {
        LocalDate start=LocalDate.of(2000, Month.JUNE, 22);
        LocalDate end=LocalDate.now();
        Period period=start.until(end);
        System.out.println("Days: "+period.get(ChronoUnit.DAYS));
        System.out.println("Months: "+period.get(ChronoUnit.MONTHS));
        System.out.println("Years: "+period.get(ChronoUnit.YEARS));
    }
}
