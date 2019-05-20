package imic.ontap.drinkshop;

public class Drink
{

  String category;
  String name;
  protected Double price;
  String size;

  public Drink()
  {
    size = "S";
  }

  public Double getPrice()
  {
    switch (size){
      case "L":
        return price + 10;
      case "M":
        return price + 5;
      default: //"S"
        return price;
    }
  }

  public String toString()
  {
    return String.format("%s   -> %sK", name, price);
  }
}
