package imic.buoi14;

/**
 * Hello world!
 */
public class ThisChicken
{
  static int soLuongConGa;
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
    String mauLong = "RED";
    System.out.println(mauLong);
    System.out.println(this.mauLong);
  }

}
