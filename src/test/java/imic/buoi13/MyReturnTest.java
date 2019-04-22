package imic.buoi13;

import org.junit.Test;

public class MyReturnTest
{
  int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 9, 9};

  @Test
  public void max()
  {
    int kq = MyReturn.max(3, 7);
    System.out.println("kq = " + kq);
  }

  @Test
  public void get2MaxNumber()
  {
    int[] kq = MyReturn.get2MaxNumber(myArray);
    System.out.println("kq = " + kq[0] + ", " + kq[1]);
  }

  @Test
  public void getSomething()
  {
    MyReturn.tryToChangeIntArray(myArray);
    System.out.println("kq = " + myArray[0] + ", " + myArray[1]);
  }

  @Test
  public void tryToChangeInt()
  {
    int myInt = 3;
    MyReturn.tryToChangeInt(myInt);
    System.out.println("myInt = " + myInt);
  }
}