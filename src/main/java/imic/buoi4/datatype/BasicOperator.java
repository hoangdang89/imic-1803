package imic.buoi4.datatype;

public class BasicOperator
{

  public static void doArithmeticOperators()
  {
    int i1 = 7 / 3;
    System.out.println("i1 = " + i1);
    int i2 = 7 % 3;
    System.out.println("i2 = " + i2);
    double d1 = 7.0 / 3;
    System.out.println(String.format("d1 = %.2f", d1));

    int i3 = 100;
    i3++;
    System.out.println("i3 = " + i3);
    int i4 = 100;
    i4--;
    System.out.println("i4 = " + i4);


  }

}
