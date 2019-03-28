package imic.buoi2.helloworld;

import imic.buoi2.object.Chicken;

/**
 * Hello world!
 */
public class App
{
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello my love!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
  }


  public static int tinhNhan(int a, int b)
  {
    return a + b;
  }

  protected static int tinhTong(int a, int b)
  {
    return a + b;
  }

  public static int tinhHamYTheoX(int x)
  {
    String mauLong;

    int y = 0;

    int a = 2;
    int b = 3;
    y = a * (x * x) + b;

    return y;
  }

}
