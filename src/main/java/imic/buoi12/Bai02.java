package imic.buoi12;

public class Bai02
{

  public void inGiaTriNhoNhatVaLonNhat()
  {
    System.out.println(Integer.MIN_VALUE);
  }

  public static void inHexa()
  {
    for(int i = 0; i <= 32; i++){
      System.out.println(String.format("TP[%s] HEX[%s] BIN[%s]", i, Integer.toHexString(i), Integer.toBinaryString(i)));
    }

    int myInt = 0x10;
    System.out.println(myInt);

    System.out.println(String.format("TP[%s] HEX[%s] BIN[%s]"
        , Integer.MIN_VALUE, Integer.toHexString(Integer.MIN_VALUE)
        , Integer.toBinaryString(Integer.MIN_VALUE)));

    System.out.println(String.format("TP[%s] HEX[%s] BIN[%s]"
        , Integer.MAX_VALUE, Integer.toHexString(Integer.MAX_VALUE)
        , Integer.toBinaryString(Integer.MAX_VALUE)));
  }
}
