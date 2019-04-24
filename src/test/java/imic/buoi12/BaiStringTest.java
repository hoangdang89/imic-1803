package imic.buoi12;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaiStringTest
{
  String bigString = "However in Java development, we come across situations where we need to use objects instead of primitive data types. In order to achieve this, Java provides wrapper class Character for primitive data type char.";

  @Test
  public void vietHoaString()
  {
    BaiString.vietHoaString();
  }

  @Test
  public void printSpecialCharacter()
  {
    BaiString.printSpecialCharacter();
  }

  @Test
  public void searchStringInString()
  {
    int position = BaiString.searchStringInString("Java", bigString);
    System.out.println("position = " + position);
  }

  @Test
  public void countStringInString()
  {
    int count = BaiString.countStringInString("we", bigString);
    System.out.printf("count = %d", count);
  }

  @Test
  public void countStringInString2()
  {
    int count = BaiString.countStringInString2("we", bigString);
    System.out.printf("count = %d", count);
  }
}