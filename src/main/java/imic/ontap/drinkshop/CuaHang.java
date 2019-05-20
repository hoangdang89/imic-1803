package imic.ontap.drinkshop;

import java.util.Arrays;

public class CuaHang
{
  Drink[] menu = {new CaPhe(), new SoDa(), new TraSua()};


  public void printMenu()
  {
    for(Drink drink: menu){
      System.out.println("item -> " + drink.toString());
    }
  }

}
