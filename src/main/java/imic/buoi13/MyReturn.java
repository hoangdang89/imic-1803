package imic.buoi13;

public class MyReturn
{


  public static int max(int a, int b)
  {
    int kq = a;
    kq = (b > a) ? b : kq;
    return kq;
  }

  public static int[] get2MaxNumber(int[] array)
  {
    int[] my2MaxNumber = new int[2];
    my2MaxNumber[0] = 8;
    my2MaxNumber[1] = 9;
    return my2MaxNumber;
  }

  public static void tryToChangeInt(int myInt)
  {
    myInt = 10;
  }

  public static void tryToChangeIntArray(int[] array)
  {
    array[0] = 8;
    array[1] = 9;
  }

  public static void tryReturnWithIntegerArray(Integer[] array)
  {
    int[] my2MaxNumber = new int[2];
    my2MaxNumber[0] = 8;
    my2MaxNumber[1] = 9;
  }
}
