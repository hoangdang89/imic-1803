package imic.buoi10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Bai02Test
{

  @Test
  public void timUocSoLonNhat()
  {
    int ketQua = Bai02.timUocSoLonNhat(6);
    System.out.println(ketQua);
    assert ketQua == 3: "Ket qua phai = 3";

    ketQua = Bai02.timUocSoLonNhat(24);
    System.out.println(ketQua);
    assert ketQua == 12: "Ket qua phai = 12";
  }
}