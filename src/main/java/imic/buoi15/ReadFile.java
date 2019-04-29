package imic.buoi15;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile
{
  public static void readInputStreamByBuffer(InputStreamReader inStreamReader) throws IOException
  {
    //NOTE: InputStreamReader is a <wrapper> of some input like File
    //while      BufferReader is a <wrapper> of InputStreamReader
    BufferedReader bufferedReader = new BufferedReader(inStreamReader);
    String line = null;
    while ((line = bufferedReader.readLine()) != null) {
      System.out.println("line -> " + line);
    }
  }

  public static void readFileWithPathJava7() throws IOException, URISyntaxException
  {
    URL urlInputFile = CopyFile.class.getClassLoader().getResource("imic/buoi15/input.txt");
    System.out.println("urlInputFile -> " + urlInputFile);
    Path inputPath = Paths.get(urlInputFile.toURI());
    System.out.println("inputPath -> " + inputPath.toString());

    System.out.println("#### Read ALL binary data");
    byte[] binaryData = Files.readAllBytes(inputPath);
    String text = new String(binaryData);
    System.out.println("input.txt -> \n" + text);

    System.out.println("#### Read ALL lines");
    List<String> lines = Files.readAllLines(inputPath);
    for(String line: lines){
      System.out.printf("line -> %s\n", line);
    }

    System.out.println("#### Read ALL lines with STREAM - JAVA8");
    Files.lines(inputPath).map(x -> "line -> " + x).forEach(System.out::println);
  }

  public static void readFileFromJARLibrary()
  {
    System.out.println("Read from JAR: poi-ooxml-3.17.jar, where we have XSSFWorkbook.class");
    ClassLoader classLoader = XSSFWorkbook.class.getClassLoader();
    URL urlInputFile = classLoader.getResource("org/apache/poi/xssf/usermodel/");
    System.out.println("urlInputFile -> " + urlInputFile);

    InputStream inputStream = classLoader.getResourceAsStream("org/apache/poi/xssf/usermodel/presetTableStyles.xml");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    System.out.println("presetTableStyles.xml -> ");
    bufferedReader.lines().forEach(System.out::println);
  }

}
