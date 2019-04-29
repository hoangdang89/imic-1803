package imic.buoi15;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;

import java.io.IOException;

public class ReadExcelTest
{

  @Test
  public void readExcelFile() throws IOException, InvalidFormatException
  {
    ReadExcel.readExcelFile();
  }
}
