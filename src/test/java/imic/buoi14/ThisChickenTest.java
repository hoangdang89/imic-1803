package imic.buoi14;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThisChickenTest
{

  @Test
  public void showConGa()
  {
    ThisChicken myChiken = new ThisChicken();
    myChiken.showConGa();
    System.out.println(myChiken.mauLong);
  }
}