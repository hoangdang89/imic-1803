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

  public static void doRelationalOperators()
  {
    int i1 = 10;
    if(i1 == 10){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    if(i1 != 10){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  public static void doLogicalOperators()
  {
    int i1 = 10;
    int i2 = 3;
    //if i1 == 10 VA i2 la so chan:
    if(i1 == 10 && (i2 % 2 == 0)){
      System.out.println("AND OK");
    }

    //if i1 == 10 HOAC i2 la so le:
    if(i1 == 10 || (i2 % 2 == 1)){
      System.out.println("OR OK");
    }
  }

  public static void doAssignmentOperators()
  {
    int i1 = 10;

    i1 = i1 + 2;
    System.out.println("i1 = " + i1);

    i1 += 5;
    System.out.println("i1 = " + i1);
  }

}
