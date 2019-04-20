package imic.buoi11;

import org.junit.Test;

import static org.junit.Assert.*;

public class GaTest
{

  @Test
  public void testGa()
  {
    Ga gaSo1 = new Ga();
    System.out.println("gaSo1 trongLuong = " + gaSo1.trongLuong);
    System.out.println("gaSo1 sanLuongTrung = " + gaSo1.sanLuongTrung);
    System.out.println("gaSo1 giatri = " + gaSo1.tinhGiaTriGa());
  }

}