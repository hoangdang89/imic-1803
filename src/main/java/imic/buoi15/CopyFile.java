package imic.buoi15;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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

  public static void copyWithFileReaderWriter(File inFile, File outFile) throws IOException
  {
    FileReader fileReader = null;
    FileWriter fileWriter = null;

    try {
      System.out.println("inFile -> " + inFile.getAbsolutePath());
      fileReader = new FileReader(inFile);
      System.out.println("outFile -> " + outFile.getAbsolutePath());
      fileWriter = new FileWriter(outFile);

      int c;
      while ((c = fileReader.read()) != -1) {
        fileWriter.write(c);
        System.out.printf("%c\n", c);
      }
    } finally {
      if (fileReader != null) {
        fileReader.close();
      }
      if (fileWriter != null) {
        fileWriter.close();
      }
    }
  }

}
