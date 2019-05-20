package imic.ontap.drinkshop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuaHangTest
{
  CuaHang cuaHang = new CuaHang();

  @Test
  public void printMenu()
  {
    cuaHang.printMenu();
  }
}