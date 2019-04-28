package imic.buoi15;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.*;

public class ReadFileTest
{

  @Test
  public void readInputStreamByBuffer() throws IOException
  {
    URL urlInputFile = CopyFile.class.getClassLoader().getResource("imic/buoi15/input.txt");
    File inputFile = new File(urlInputFile.getFile());
    System.out.println("inputFile -> " + inputFile);
    InputStreamReader inReader = new InputStreamReader(
        new FileInputStream(inputFile));

    ReadFile.readInputStreamByBuffer(inReader);
  }

  @Test
  public void readFileWithPathJava7() throws IOException, URISyntaxException
  {
    ReadFile.readFileWithPathJava7();
  }
}