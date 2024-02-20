package dateandtimeapi;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateandTime {
    public static void main(String[] args) throws InterruptedException {
        Instant curreInstant=Instant.now();
        System.out.println("Current time: "+curreInstant);
        LocalDate today=LocalDate.now();
        System.out.println("Today : "+today);
        LocalDate birthDate=LocalDate.of(2000, Month.JUNE, 22);
        System.out.println("Birthday: "+birthDate);
        System.out.println("Tomorrow: "+today.plusDays(1));
        System.out.println("Month : "+today.getMonth());
        System.out.println("Day of week: "+today.getDayOfWeek());
        System.out.println("Leap year: "+today.isLeapYear());
        System.out.println(" Last day: "+today.withDayOfMonth(30));
        System.out.println("Last week date: "+today.minusDays(7).getDayOfWeek());
        // System.out.println("Wait: ");
        ZonedDateTime currTime=ZonedDateTime.now();
        ZonedDateTime currTimeInParis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Current time: "+currTime);
        System.out.println("Paris time: "+currTimeInParis);
        //Date and time formatting ,parsing
        DateTimeFormatter dateFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Formatted date: "+today.format(dateFormatter));
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String text="14/12/2023";
        LocalDate date=LocalDate.parse(text,ofPattern);
        System.out.println("Date : "+date);

    }
}
