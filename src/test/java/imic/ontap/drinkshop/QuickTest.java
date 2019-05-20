package imic.ontap.drinkshop;

import org.junit.Test;

public class QuickTest
{

  @Test
  public void testString()
  {
    String dsDoUongDaMua = "CCTSCTSTTT";

    int count = 0;
    for(Character ch: dsDoUongDaMua.toCharArray()){
      if(new CaPhe().category.equalsIgnoreCase(Character.toString(ch))){
        count++;
        System.out.println(String.format("da mua %d ly ca phe", count));
      }

    }
  }
}
