package imic.buoi15;

import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

public class CopyFileTest
{

  @Test
  public void copyWithFileInOutStream() throws IOException, URISyntaxException
  {
    CopyFile.copyWithFileInOutStream();
  }

  @Test
  public void copyWithFileReaderWriter() throws IOException
  {
    URL urlInputFile = CopyFile.class.getClassLoader().getResource("imic/buoi15/input.txt");
    System.out.println("urlInputFile -> " + urlInputFile);
    String strInFile = urlInputFile.getFile();
    System.out.println("strInFile -> " + strInFile);
    File inputFile = new File(strInFile);

    URL urlBuoi15 = CopyFile.class.getClassLoader().getResource("imic/buoi15/");
    System.out.println("urlBuoi15 -> " + urlBuoi15);
    String strOutFile = urlBuoi15.getFile() + "output.txt";
    System.out.println("strOutFile -> " + strOutFile);
    File outputFile = new File(strOutFile);

    CopyFile.copyWithFileReaderWriter(inputFile, outputFile);
  }

  @Test
  public void readInputStreamByBuffer() throws IOException
  {
    URL urlInputFile = CopyFile.class.getClassLoader().getResource("imic/buoi15/input.txt");
    File inputFile = new File(urlInputFile.getFile());
    System.out.println("inputFile -> " + inputFile);
    InputStreamReader inReader = new InputStreamReader(
        new FileInputStream(inputFile));

    CopyFile.readInputStreamByBuffer(inReader);
  }
}