package imic.buoi14;

public class JavaGeneric
{
  public static void main(String[] args) {
    int a = 11;
    int b = 6;
    double c = 7.3;
    double d = 9.4;
    int result1 = minFunction(a, b);

    // same function name with different parameters
    double result2 = minFunction(c, d);
    System.out.println("Minimum Value = " + result1);
    System.out.println("Minimum Value = " + result2);
  }

  // for integer
  public static <T extends Comparable<T>> T minFunction(T n1, T n2) {
    T min;
    if (n2.compareTo(n1) < 0)
      min = n2;
    else
      min = n1;

    return min;
  }

}
