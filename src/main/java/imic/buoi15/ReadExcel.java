package imic.buoi15;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

public class ReadExcel
{

  public static void readExcelFile() throws IOException, InvalidFormatException
  {
    URL resources = ReadExcel.class.getClassLoader().getResource("imic/buoi15/contact.xlsx");
    System.out.println("resources -> " + resources.toString());
    File excelFile = new File(resources.getFile());

    // we create an XSSFWorkbook object for our XLSX File (Excel)
    XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
    XSSFSheet sheet = workbook.getSheetAt(0);

    Iterator<Row> rowIt = sheet.iterator();
    while (rowIt.hasNext()) {
      Row row = rowIt.next();

      Iterator<Cell> cellIterator = row.cellIterator();
      while (cellIterator.hasNext()) {
        Cell cell = cellIterator.next();
        System.out.print(cell.toString() + ";");
      }
      System.out.println();
    }

    workbook.close();
  }
}
