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
      doanhThu += drink.getPrice();
    }

    return doanhThu;
  }

  public double tinhDoanhThu(String dsBanDuoc, String dsSize)
  {
    //Bai 4.d) Viết chương trình tính doanh thu cửa hàng thu được voi siz
    if(dsSize == null || dsSize.isEmpty()){
      return tinhDoanhThu(dsBanDuoc);
    }

    List<Drink> lsBanDuoc = chuyenDoi(dsBanDuoc);
    setSize(lsBanDuoc, dsSize);

    double doanhThu = 0.0;
    for (Drink drink: lsBanDuoc){
      //System.out.println("drink -> " + drink);
      doanhThu += drink.getPrice();
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

  private void setSize(List<Drink> dsDoUong, String dsSize)
  {
    int i = 0;
    for(Character ch: dsSize.toCharArray()){
      switch (ch){
        case 'L':
          dsDoUong.get(i).size = "L";
          break;
        case 'M':
          dsDoUong.get(i).size = "M";
          break;
        default: //"S"
          break;
      }
      i++;
    }
  }

}
