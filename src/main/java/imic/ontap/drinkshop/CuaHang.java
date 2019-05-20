package imic.ontap.drinkshop;

import java.util.ArrayList;
import java.util.List;

public class CuaHang
{
  Drink[] menu = {new CaPhe(), new SoDa(), new TraSua()};


  public void printMenu()
  {
    //Bai 4.a) Viết chương trình in ra menu đồ uống của cửa hàng.
    for(Drink drink: menu){
      System.out.println("item -> " + drink.toString());
    }
  }

  public double tinhDoanhThu(String dsBanDuoc)
  {
    //Bai 4.b+c) Viết chương trình tính doanh thu cửa hàng thu được.
    List<Drink> lsBanDuoc = chuyenDoi(dsBanDuoc);

    double doanhThu = 0.0;
    for (Drink drink: lsBanDuoc){
      //System.out.println("drink -> " + drink);
      doanhThu += drink.price;
    }

    return doanhThu;
  }


  //----------
  private List<Drink> chuyenDoi(String dsDoUong)
  {
    List<Drink> lsDoUong = new ArrayList<>();

    for(Character ch: dsDoUong.toCharArray()){
      switch (ch){
        case 'C':
          lsDoUong.add(new CaPhe());
          break;
        case 'T':
          lsDoUong.add(new TraSua());
          break;
        case 'S':
          lsDoUong.add(new SoDa());
          break;
        default:
          break;
      }
    }

    return lsDoUong;
  }

}
