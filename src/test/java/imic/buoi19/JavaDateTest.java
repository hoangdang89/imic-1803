package imic.buoi19;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaDateTest
{
  @Test
  public void testDateDistance() throws ParseException
  {
    Date currentDate = new Date();

    String strDate = "31/05/2019";
    Date lastDateOfMonth = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);

    Long timeDistance = lastDateOfMonth.getTime() - currentDate.getTime();
    System.out.println("date distance = " + timeDistance + " in miliseconds");
  }

  @Test
  public void testLocalDateDistance()
  {
    LocalDate currentDate = LocalDate.now();
    System.out.println("currentDate -> " + currentDate);

    int maxDaysOfMonth = currentDate.lengthOfMonth();
    LocalDate lastDateOfMonth = currentDate.withDayOfMonth(maxDaysOfMonth);
    System.out.println("lastDateOfMonth -> " + lastDateOfMonth);

    long dayDistance = lastDateOfMonth.toEpochDay() - currentDate.toEpochDay();
    System.out.println("dayDistance -> " + dayDistance);
  }

  @Test
  public void testConvertDateFromString()
  {
    LocalDateTime myDate = LocalDateTime.parse("2007-12-03T10:15:30");
    System.out.println("myDate -> " + myDate);

    LocalDateTime myDate2 = LocalDateTime.parse("03/12/2007 10:15:30"
        , DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    System.out.println("myDate2 -> " + myDate2);
  }
}
