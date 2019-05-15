package imic.buoi19;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
}
