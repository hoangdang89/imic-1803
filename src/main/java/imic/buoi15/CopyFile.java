package imic.buoi15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class CopyFile
{

  public static void copyWithFileInOutStream() throws IOException, URISyntaxException
  {
    FileInputStream inStream = null;
    FileOutputStream outStream = null;

    try {
      URL urlInputFile = CopyFile.class.getClassLoader().getResource("imic/buoi15/input.txt");
      System.out.println("urlInputFile -> " + urlInputFile);
      String strInFile = urlInputFile.getFile();
      System.out.println("strInFile -> " + strInFile);
      File inputFile = new File(strInFile);
      System.out.println("inputFile -> " + inputFile.getAbsolutePath());
      inStream = new FileInputStream(inputFile);

      URL urlBuoi15 = CopyFile.class.getClassLoader().getResource("imic/buoi15/");
      System.out.println("urlBuoi15 -> " + urlBuoi15);
      String strOutFile = urlBuoi15.getFile() + "output.txt";
      System.out.println("strOutFile -> " + strOutFile);
      File outputFile = new File(strOutFile);
      System.out.println("outputFile -> " + outputFile.getAbsolutePath());
      outStream = new FileOutputStream(outputFile);

      int c;
      while ((c = inStream.read()) != -1) {
        outStream.write(c);
        System.out.printf("%c\n", c);
      }
    } finally {
      if (inStream != null) {
        inStream.close();
      }
      if (outStream != null) {
        outStream.close();
      }
    }
  }

}
