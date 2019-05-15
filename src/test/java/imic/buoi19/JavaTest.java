package imic.buoi19;

import org.junit.Test;

public class JavaTest
{

  @Test
  public void testHashCode()
  {
    String myString1 = "Hello World";
    String myString2 = "Hello World2";
    System.out.println("hashCode -> " + myString1.hashCode());
    System.out.println("hashCode -> " + myString2.hashCode());

    Integer.compare(myString1.hashCode(), myString2.hashCode());
  }

}
