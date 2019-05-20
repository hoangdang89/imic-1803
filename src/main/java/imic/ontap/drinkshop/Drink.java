package imic.ontap.drinkshop;

public class Drink
{

  static String category;
  static String name;
  static Double price;


  public String toString() {
    return String.format("%s   -> %sK", name, price);
  }
}
