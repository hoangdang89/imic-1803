package imic.buoi15;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

public class ReadExcelTest
{

  @Test
  public void readExcelFile() throws IOException, URISyntaxException
  {
    File excelFile = new File(ReadExcelTest.class.getClassLoader().getResource("imic/buoi15/contact.xlsx").toURI());
    FileInputStream fis = new FileInputStream(excelFile);

    // we create an XSSF Workbook object for our XLSX Excel File
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheetAt(0);

    Iterator<Row> rowIt = sheet.iterator();
    while (rowIt.hasNext()) {
      Row row = rowIt.next();
      // iterate on cells for the current row
      Iterator<Cell> cellIterator = row.cellIterator();

      while (cellIterator.hasNext()) {
        Cell cell = cellIterator.next();
        System.out.print(cell.toString() + ";");
      }
      System.out.println();
    }

    workbook.close();
    fis.close();
  }
}
