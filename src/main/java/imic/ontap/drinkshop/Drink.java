package imic.ontap.drinkshop;

public class Drink
{

  String category;
  String name;
  Double price;


  public String toString() {
    return String.format("%s   -> %sK", name, price);
  }
}
