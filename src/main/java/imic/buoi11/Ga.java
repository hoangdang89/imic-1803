package imic.buoi11;

import java.util.Random;

public class Ga
{
  //----------- Thuoc tinh
  int id;

  int trongLuong;
  int sanLuongTrung;


  //----------- Ham
  public Ga()
  {
    Random random = new Random();
    trongLuong = random.nextInt(10) + 1;
    sanLuongTrung = random.nextInt(50) + 1;
  }


  public double tinhGiaTriGa()
  {
    double giaTriGa = 0;

    //Do something here
    return giaTriGa;
  }


}
