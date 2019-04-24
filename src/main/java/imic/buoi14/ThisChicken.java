package imic.buoi14;

/**
 * Hello world!
 */
public class ThisChicken
{
  static int soLuongConGa = 0;
  String name;
  String mauLong = "YELLOW";


  public ThisChicken(String name){
    this.name = name;
  }

  public ThisChicken(){
    //new ThisChicken("CHICKEN");
    this("CHICKEN");
  }


  public void showConGa()
  {
    int soLuongConGa = 10;
    String mauLong = "RED";
    System.out.println(mauLong);
    System.out.println(this.mauLong);
    System.out.println(soLuongConGa);
    System.out.println(ThisChicken.soLuongConGa);
  }

}
