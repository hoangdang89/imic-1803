package imic.buoi14;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaGenericTest
{

  @Test
  public void getSum()
  {
    int[] arrays = {1, 2, 3, 4, 5};
    int sum = JavaGeneric.getSum(arrays);
    System.out.println("sum = " + sum);
  }
}