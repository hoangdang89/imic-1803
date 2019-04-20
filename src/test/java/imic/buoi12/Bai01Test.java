package imic.buoi12;

import org.junit.Test;

public class Bai01Test
{

  @Test
  public void square()
  {
    int x = 4;
    Bai01.changeInteger(x);
    System.out.println(x);
  }

  @Test
  public void changeArray()
  {
    int[] x = new int[3];
    x[0] = 4;
    Bai01.changeArray(x);
    System.out.println(x[0] + " " + x[1] + " " + x[2]);
  }
}