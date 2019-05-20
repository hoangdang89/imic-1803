package imic.ontap.drinkshop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuaHangTest
{
  CuaHang cuaHang = new CuaHang();

  @Test
  public void printMenu()
  {
    System.out.println("##--- Menu cua hang --##");
    cuaHang.printMenu();
    System.out.println("##--- Menu cua hang --##");
  }

  @Test
  public void tinhDoanhThu()
  {
    String dsBanDuoc = "CCTSCTSTTT";
    Double doanhThu = cuaHang.tinhDoanhThu(dsBanDuoc);
    System.out.println(String.format("doanh thu sau %s gio -> %sK", dsBanDuoc.length(), doanhThu));
  }

  @Test
  public void tinhDoanhThu2()
  {
    String dsBanDuoc = "CCTSCTSTTTTSCSCTTTSCCSTCSSSTTTTTT";
    Double doanhThu = cuaHang.tinhDoanhThu(dsBanDuoc);
    System.out.println(String.format("doanh thu sau %s gio -> %sK", dsBanDuoc.length(), doanhThu));
  }
}